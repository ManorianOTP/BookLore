SUMMARY = "BookLore test data - sample ebook for development"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://test-book.epub"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/home/root/books
    install -m 0644 ${WORKDIR}/test-book.epub ${D}/home/root/books/test-book.epub
}

FILES:${PN} = "/home/root/books/*"
