# Ryden's Crowbar

A simple, open-source Minecraft plugin for **Minecraft 1.8.8 and eaglercraft** servers running Spigot or Paper.

Created by **RydenVR**.

## Features

- `/crowbar` — Gives you Ryden's Crowbar.
- Admin-only command by default.
- Custom item name and lore.
- Built for Minecraft 1.8.8.
- Open source and customizable.

## Requirements

- A Minecraft 1.8.8 Spigot or Paper server.
- Java 8-compatible server environment.
- The compiled plugin JAR from the repository's GitHub Actions build.

## Installation

1. Download the latest `Rydens-Crowbar` artifact from the repository's **Actions** tab.
2. Extract the downloaded ZIP file.
3. Find `rydens-crowbar-1.0.0.jar`.
4. Put the JAR in your server's `plugins` folder.
5. Restart the server.
6. Make sure you are an operator, then run `/crowbar` in-game.

**Note:** The downloaded artifact is a ZIP containing the plugin JAR. Do not put the artifact ZIP itself in the plugins folder.

## How to Change the Plugin

You can customize the plugin by editing the source files before building it again.

### 1. Change the Crowbar's Name

Open:

`src/main/java/com/rydenvr/crowbar/CrowbarPlugin.java`

Find this line:

```java
meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Crowbar");
```

Change `"Crowbar"` to your preferred name.

For example:

```java
meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "My Crowbar");
```

### 2. Change the Crowbar's Description

In the same Java file, find:

```java
meta.setLore(Arrays.asList(
    ChatColor.DARK_GRAY + "Ryden's Crowbar",
    ChatColor.GRAY + "Admin-only tool"
));
```

Replace the text with your own description. You can use `ChatColor` to change text colors.

### 3. Change the Item

Find:

```java
ItemStack crowbar = new ItemStack(Material.IRON_HOE);
```

Change `Material.IRON_HOE` to another Minecraft 1.8.8 material, such as:

- `Material.STICK`
- `Material.IRON_INGOT`
- `Material.DIAMOND`
- `Material.BLAZE_ROD`

The item will still have the custom name and description.

### 4. Change the Command or Permissions

Open:

`src/main/resources/plugin.yml`

The command is defined under `commands:`. The permission is:

`rydenscrowbar.admin`

The permission defaults to `op`, meaning server operators can use it by default. If you change the command or permission in `plugin.yml`, update the Java code as needed so both files match.

### 5. Build Your Changes

After editing the source:

1. Commit your changes to GitHub.
2. Open the repository's **Actions** tab.
3. Open the latest build.
4. Wait for the green checkmark.
5. Download the new artifact ZIP.
6. Extract the updated JAR and install it on your test server.

## Project Structure

```text
Rydens-Crowbar/
├── pom.xml
├── README.md
├── .github/
│   └── workflows/
│       └── build.yml
└── src/
    └── main/
        ├── java/
        │   └── com/rydenvr/crowbar/
        │       └── CrowbarPlugin.java
        └── resources/
            └── plugin.yml
```

## Troubleshooting

- **Command not found:** Check that the plugin loaded successfully and that the JAR is in the server's `plugins` folder.
- **No permission:** Make sure you are an operator or have the `rydenscrowbar.admin` permission.
- **Build failed:** Open the failed run in GitHub Actions and read the error in the build log.
- **Plugin won't load:** Check the server console for errors and verify that the server version is compatible.

## Contributing

Feel free to fork this repository, customize the plugin, and submit improvements.

Test your changes on a separate server before using them on a live server.

## License

Unless a license file is added to this repository, all rights are reserved by the copyright holder. If you want others to freely modify, redistribute, and reuse the code, add an open-source license such as the MIT License.

---

**Made by RydenVR**
