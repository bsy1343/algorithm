# [Platinum II] 유산 - 24235

[문제 링크](https://www.acmicpc.net/problem/24235)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 610, 정답: 124, 맞힌 사람: 69, 정답 비율: 15.541%

### 분류

기하학, 이분 탐색, 매개 변수 탐색, 볼록 껍질, 다각형의 넓이

### 문제 설명

<p>조상때부터 대대로 물려받던 땅이 있다. 땅이 매우 크기 때문에 $N$개 위치를 좌표평면 위에 점으로 표시를 해놓았다. 땅은 $N$개의 점을 모두 포함하는 가장 작은 볼록다각형이다.</p>

<p>이 땅을 두 명한테 나눠주려고 한다. 나눠주는 땅의 넓이가 같도록 해야 싸움이 일어나지 않을 것이기 때문에 $y$축이랑 평행한 직선 $x = a$를 그어 나눠지는 두 땅의 넓이가 같도록 하려고 한다.</p>

<p>[그림 1]처럼 좌표평면에 9개 점이 존재한다고 가정해보자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24235.%E2%80%85%EC%9C%A0%EC%82%B0/99b6fa79.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24235.%E2%80%85%EC%9C%A0%EC%82%B0/99b6fa79.png" data-original-src="https://upload.acmicpc.net/5724fbdf-9ef9-4726-8f99-c786b3867874/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 596px; height: 500px;" /></p>

<p style="text-align: center;">[그림 1] 9개의 점을&nbsp;좌표평면에 표시</p>

<p>땅을 표시하는&nbsp;좌표평면 정보에서&nbsp;땅은 9개의 점을 모두 포함하는 가장 작은 볼록다각형이기 때문에 [그림 2]와&nbsp;같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24235.%E2%80%85%EC%9C%A0%EC%82%B0/babbcffd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24235.%E2%80%85%EC%9C%A0%EC%82%B0/babbcffd.png" data-original-src="https://upload.acmicpc.net/6ccc2e35-3399-4d2a-a70d-799734cfccaf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 596px; height: 500px;" /></p>

<p style="text-align: center;">[그림 2] 좌표평면에 땅에 해당하는 부분 표시</p>

<p>두 명이 이 땅을 넓이가 같도록 나눠야 하기 때문에 [그림 3]처럼 직선을 그어 두 땅의 넓이가 같도록 구분하면 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24235.%E2%80%85%EC%9C%A0%EC%82%B0/42d45e8d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24235.%E2%80%85%EC%9C%A0%EC%82%B0/42d45e8d.png" data-original-src="https://upload.acmicpc.net/61b33929-d1e9-4bfd-af3d-59b483041904/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 596px; height: 500px;" /></p>

<p style="text-align: center;">[그림 3] 두 땅의 넓이가 같도록 $x = a$ 직선으로 구분</p>

<p>땅의 정보가 주어졌을 때 같은 면적의 땅을 나눌 수 있도록 $a$의 값을 찾아주자.</p>

### 입력

<p>첫째 줄에 깃발의 개수 $N$ ($3 &le; N &le; 500,000$)이 주어진다.&nbsp;</p>

<p>둘째 줄부터 $N$개의 줄에 깃발이 위치한 좌표 $x$, $y$ ($-10^{9}&nbsp;&le; x, y &le; 10^{9}$)가 공백으로 구분되어 주어진다. 중복된 좌표가 없음과 볼록다각형의 넓이가 항상 0보다 큰 것을 보장한다.</p>

<p>입력으로 주어지는 모든 값은 정수이다.</p>

### 출력

<p>$a$의 값을 출력한다. 모범 답안과의 절대/상대 오차가 10<sup>-3</sup>&nbsp;이하인 경우 정답으로 인정된다.</p>