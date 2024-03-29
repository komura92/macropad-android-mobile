# Macropad Android app

This app is the UI part of my open source project called "Ninja-Macropad".

During free time I will make some docs about this project to make it usable for those who want 
to increase productivity level with me.


## System showcase

![Examples of automations](/images/macropad-mobile-gif.gif)

## Configuration

If you want to make your own application functions you have to edit this code. 
Actually there is no automatic config in this project.
Don't forget to set your server address in 
[ServerConfig.java](/app/src/main/java/com/itninja/macropad/app/api/config/ServerConfig.java).

## Note

This project was migrated to flutter and this android repo will be no longer supported.
Flutter version is available [here](https://github.com/komura92/ninja_macropad_flutter).

## Roadmap

In the future, I want to add some additional features to this project. It will be probably about 
two things per year, depending of my time availability.

There's a shortly described list:
- changing active workspace on PC triggers changing active menu option in mobile app [MP-AM-F-01],
- dynamic configuration for connection data [MP-AM-F-02],
- dynamic configuration for panels content [MP-AM-F-03],
- dynamic configuration for menu options [MP-AM-F-04],
- dropdown for choosing which device to control [MP-AM-F-05],
- menu entry for graphic panel (OBS etc.) [MP-AM-F-06],
- ~~migration to flutter [MP-AM-F-07]~~.
