#!/usr/bin/env bash
# 本地构建（当前平台）
set -e
cd "$(dirname "$0")"

if [ ! -f gradlew ]; then
  echo "==> 生成 Gradle Wrapper"
  gradle wrapper --gradle-version 8.11.1
fi

echo "==> 编译并打包"
./gradlew :packageDistributionForCurrentOS

echo ""
echo "✓ 产物：build/compose/binaries/main/"
