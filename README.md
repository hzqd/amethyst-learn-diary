# Study Diary for Amethyst

## How to run

To run the game on Windows and Linux, use

```
cargo run --features "vulkan"
```

and on macOS

```
cargo run --features "metal"
```

For building without any graphics backend, you can use

```
cargo run --features "empty"
```

but be aware that as soon as you need any rendering you won't be able to run your game when using
the `empty` feature.
