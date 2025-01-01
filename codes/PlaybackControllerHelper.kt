class PlaybackControllerHelper {
    // ...existing code...

    fun adjustPlaybackSpeed(speed: Float) {
        // Logic to adjust playback speed
        player?.setPlaybackParameters(PlaybackParameters(speed))
    }

    // ...existing code...
}
