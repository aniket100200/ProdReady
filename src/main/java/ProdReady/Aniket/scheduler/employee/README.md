<table class="sc-bwzfXH dYaBhr">
    <thead>
    <tr>
        <th>*</th>
        <th>*</th>
        <th>*</th>
        <th>*</th>
        <th>*</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>minute (0-59)</td>
        <td>hour (0 - 23)</td>
        <td>day of the month (1 - 31)</td>
        <td>month (1 - 12)</td>
        <td>day of the week (0 - 6)</td>
    </tr>
    </tbody>
</table>

- examples for you

<table class="sc-bwzfXH dYaBhr">
    <thead>
    <tr>
        <th>Cron expression</th>
        <th>Schedule</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>* * * * *</td>
        <td>Every minute</td>
    </tr>
    <tr>
        <td>0 * * * *</td>
        <td>Every hour</td>
    </tr>
    <tr>
        <td>0 0 * * *</td>
        <td>Every day at 12:00 AM</td>
    </tr>
    <tr>
        <td>0 0 * * FRI</td>
        <td>At 12:00 AM, only on Friday</td>
    </tr>
    <tr>
        <td>0 0 1 * *</td>
        <td>At 12:00 AM, on day 1 of the month</td>
    </tr>
    </tbody>
</table>
