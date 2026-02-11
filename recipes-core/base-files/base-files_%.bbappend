# Set the system hostname.
# The base-files recipe reads this variable and writes it to /etc/hostname.
hostname = "booklore"

# Extend the install task to add our custom system files.
do_install:append() {
    # Pre-login banner: displayed above the "login:" prompt
    cat > ${D}${sysconfdir}/issue << 'BANNER'

  ____              _    _                   
 | __ )  ___   ___ | | _| |    ___  _ __ ___ 
 |  _ \ / _ \ / _ \| |/ / |   / _ \| '__/ _ \
 | |_) | (_) | (_) |   <| |__| (_) | | |  __/
 |____/ \___/ \___/|_|\_\_____\___/|_|  \___|
                                              
  BookLore E-Reader OS | \l

BANNER

    # Post-login message: displayed after a successful login
    cat > ${D}${sysconfdir}/motd << 'MOTD'

  Welcome to BookLore E-Reader OS
  --------------------------------
  System ready for development.
  Run 'booklore-hello' to verify.

MOTD
}
