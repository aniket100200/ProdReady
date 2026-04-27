## Spring Boot - Event-Driven Communication with ApplicationEventPublisher

- In real world applications, not everything needs direct method calls...

- We often want loose coupling between components.

- That’s where Event Driven Communication comes in...

➡️ What is Event-Driven Approach?

```
🔹One component publishes an event
🔹Other components listen and react
🔹No tight dependency between them
```

➡️ Why Event Driven Architecture is Appreciated?

```
🔹It decouples components
🔹Improves scalability
🔹Provides cleaner architecture
🔹Easy to extend (you can add more listeners anytime)
```

---

- Now let’s implement it in Spring Boot.

➡️ Create and Listen to Custom Events

- it's a 3-step process:

```text
🔹Step 1: Define a Custom Event
🔹Step 2: Publish the Event
🔹Step 3: Listen to the Event
```

➡️ What’s Happening Actually?

```text
🔹Event is published after user creation
🔹Listener automatically reacts
🔹No direct dependency between components
```

---

## Steps

- Step 1: Define a Custom Event

```java
public class UserCreatedEvent extends ApplicationEvent {

    private String email;

    public UserCreatedEvent(Object source, String email) {
        super(source);
        this.email = email;
    }
}
```

- Step 2: publish the event

```java

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final ApplicationEventPublisher publisher;

    @Override
    public UserResponseDto create(UserRequestDto requestDto) {
        User user = UserTransformer.userFromUserRequestDto(requestDto);
        user = saveOrUpdate(user);

        publisher.publishEvent(new UserCreatedEvent(this, requestDto.email()));
        return UserTransformer.userResponseDtoFromUser(user);
    }
}
```

- Step 3: Listen to the Event.

```java

```
