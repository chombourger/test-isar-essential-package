
inherit dpkg

SRC_URI = "apt://base-files file://changelog"

do_prepare_build() {
	install -m 644 ${WORKDIR}/changelog ${S}/debian/
}
