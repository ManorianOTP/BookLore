SUMMARY = "BookLore E-Reader OS image"
DESCRIPTION = "A minimal Linux image for the BookLore e-reader OS."

inherit core-image

IMAGE_INSTALL += " \
    booklore-hello \
    booklore-init \
    booklore-testdata \
"

IMAGE_INSTALL += " \
    util-linux \
    less \
"

EXTRA_IMAGE_FEATURES += "debug-tweaks"

IMAGE_LINGUAS = "en-us"
