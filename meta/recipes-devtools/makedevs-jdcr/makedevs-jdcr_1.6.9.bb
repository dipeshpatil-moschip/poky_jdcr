SUMMARY = "JDCR Hello world"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPL-2.0-only"

FILESEXTRAPATHS:prepend := "${THISDIR}/source_files:"
SRC_URI = "file://hello_world.c"

S="${WORKDIR}"

python do_fetch:prepend(){
    bb.note( "JDCR :: do_fetch going to run")
}
python do_fetch:append () {
    bb.note ("JDCR :: do_fetch append")
}