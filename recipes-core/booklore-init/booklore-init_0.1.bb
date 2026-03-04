SUMMARY = "BookLore e-reader startup script"
DESCRIPTION = "SysVinit startup script for the BookLore e-reader OS."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://booklore-init.sh"

S = "${WORKDIR}"

RDEPENDS:${PN} = "booklore-hello"

inherit update-rc.d

INITSCRIPT_NAME = "booklore-init.sh"
INITSCRIPT_PARAMS = "defaults 99"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/booklore-init.sh ${D}${sysconfdir}/init.d/booklore-init.sh
}
