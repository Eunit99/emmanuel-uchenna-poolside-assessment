public class CustomPlaybackOverlayFragment extends Fragment {
    // ...existing code...

    private void showPlaybackSpeedDialog() {
        // Logic to show a dialog for selecting playback speed
        String[] speeds = {"0.5x", "1x", "1.5x", "2x"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Select Playback Speed")
               .setItems(speeds, (dialog, which) -> {
                   float speed = 1.0f;
                   switch (which) {
                       case 0: speed = 0.5f; break;
                       case 1: speed = 1.0f; break;
                       case 2: speed = 1.5f; break;
                       case 3: speed = 2.0f; break;
                   }
                   playbackControllerHelper.adjustPlaybackSpeed(speed);
               });
        builder.create().show();
    }

    // ...existing code...
}
