# [Bronze II] 기숙사 바닥 - 2858

[문제 링크](https://www.acmicpc.net/problem/2858)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6099, 정답: 3503, 맞힌 사람: 2926, 정답 비율: 58.403%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>상근이는 기숙사 생활을 한다. 상근이의 방의 크기는 L&times;W 이다.</p>

<p>수업시간에 타일 채우기 경우의 수를 계산하던 상근이는 자신의 방도 1&times;1크기 타일로 채우려고 한다. 이때, 가장자리는 빨간색으로, 나머지는 갈색으로 채우려고 한다.</p>

<p>아래 그림은 상근이의 방의 크기가 4&times;3일 때 이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/2858.%E2%80%85%EA%B8%B0%EC%88%99%EC%82%AC%E2%80%85%EB%B0%94%EB%8B%A5/f0fa9ee9.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/2858.%E2%80%85%EA%B8%B0%EC%88%99%EC%82%AC%E2%80%85%EB%B0%94%EB%8B%A5/f0fa9ee9.png" data-original-src="https://upload.acmicpc.net/4600f2e6-6349-4c85-b3c9-e6f3a8e3f79a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 94px;" /></p>

<p>어느 날 상근이네 방에 하근이가 놀러왔다. 하근이는 아름다운 타일 배치에 감동받았다. 다시 방으로 돌아온 하근이는 빨간색과 갈색 타일의 개수는 기억했지만, 방의 크기는 기억해내지 못했다.</p>

<p>빨간색과 갈색 타일의 개수가 주어졌을 때, 상근이 방의 크기를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 빨간색 타일의 수 R과 갈색 타일의 수 B가 주어진다. (8 &le; R &le; 5000, 1 &le; B &le; 2,000,000)</p>

### 출력

<p>첫째 줄에 상근이네 방의 크기 L과 W을 공백으로 구분하여 출력한다. 만약, 두 수가 다르다면, 큰 수가 L이 되고 작은 수가 W이 된다. 항상 정답이 유일한 경우만 입력으로 주어진다.</p>