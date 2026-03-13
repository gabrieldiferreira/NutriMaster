#!/bin/bash
set -e

echo "🔎 Verificando dependências"

echo "🧪 Android + KMP (debug only)"
./gradlew assembleDebug \
  -x composeApp:linkReleaseFrameworkIosArm64 \
  -x composeApp:linkReleaseFrameworkIosX64 \
  -x composeApp:linkReleaseFrameworkIosSimulatorArm64

echo "🧪 iOS (SPM – resolve only)"
cd iosApp
xcodebuild -resolvePackageDependencies
cd ..

echo "✅ OK para commit / push"

