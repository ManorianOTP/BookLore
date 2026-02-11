SUMMARY = "BookLore e-reader hello world"
DESCRIPTION = "A minimal test application for the BookLore e-reader OS."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://booklore-hello.c"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} -o booklore-hello booklore-hello.c
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 booklore-hello ${D}${bindir}
}
