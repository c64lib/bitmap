import com.github.c64lib.retroassembler.domain.AssemblerType

plugins {
    id("com.github.c64lib.retro-assembler") version "1.4.3"
}

repositories {
     mavenCentral()
}

retroProject {
    dialect = AssemblerType.KickAssembler
    dialectVersion = "5.20"
    libDirs = arrayOf(".ra/deps/c64lib")
    srcDirs = arrayOf("lib", "spec")

    libFromGitHub("c64lib/common", "develop")
    libFromGitHub("c64lib/chipset", "develop")
}
