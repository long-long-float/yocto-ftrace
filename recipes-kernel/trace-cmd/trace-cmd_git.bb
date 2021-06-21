# Copyright (C) 2021 long-long-float
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation; either version 2 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
#
# Modifications:
#   2021/06/21: Add double quotes to PR and add a revision as SRCREV

DESCRIPTION = "User interface to Ftrace"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
                    file://trace-cmd.c;beginline=6;endline=8;md5=2c22c965a649ddd7973d7913c5634a5e"

SRCREV = "e7ffcbda9d62855ec30dc36ef5bebcb669321073"
PR = "r0"
PV = "1.0.5+git${SRCPV}"

inherit pkgconfig

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/rostedt/trace-cmd.git;protocol=git"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'prefix=${prefix}'"

do_install() {
	oe_runmake prefix="${prefix}" DESTDIR="${D}" install
}
