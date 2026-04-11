package ProdReady.Aniket.enums;

import lombok.Getter;

@Getter
public enum AllowedFileType {
  JPG("jpg", "image/jpeg", new byte[] {(byte) 0xFF, (byte) 0xD8, (byte) 0xFF}),
  PNG("png", "image/png", new byte[] {(byte) 0x89, 'P', 'N', 'G'}),
  PDF("pdf", "application/pdf", new byte[] {'%', 'P', 'D', 'F'});

  private final String extension;
  private final String mimeType;
  private final byte[] magicBytes;

  AllowedFileType(String extension, String mimeType, byte[] magicBytes) {
    this.extension = extension;
    this.mimeType = mimeType;
    this.magicBytes = magicBytes;
  }

  public static AllowedFileType fromExtension(String ext) {
    for (AllowedFileType type : values()) {
      if (type.extension.equalsIgnoreCase(ext)) return type;
    }
    return null;
  }
}
