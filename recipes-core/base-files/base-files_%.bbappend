hostname = "booklore"

do_install:append() {
    cat > ${D}${sysconfdir}/issue << 'BANNER'

  ____              _    _
 | __ )  ___   ___ | | _| |    ___  _ __ ___
 |  _ \ / _ \ / _ \| |/ / |   / _ \| '__/ _ \
 | |_) | (_) | (_) |   <| |__| (_) | | |  __/
 |____/ \___/ \___/|_|\_\_____\___/|_|  \___|

  BookLore E-Reader OS | \l

BANNER

    cat > ${D}${sysconfdir}/motd << 'MOTD'

  Welcome to BookLore E-Reader OS
  --------------------------------
  System ready for development.
  Run 'booklore-hello' to verify.

MOTD
}
