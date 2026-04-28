# [Gold IV] 성인 게임 - 23256

[문제 링크](https://www.acmicpc.net/problem/23256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 738, 정답: 319, 맞힌 사람: 232, 정답 비율: 40.630%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>채완이가 좋아하는 성인 게임에는 칼 아이템이 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23256.%E2%80%85%EC%84%B1%EC%9D%B8%E2%80%85%EA%B2%8C%EC%9E%84/1ac7de9c.png" data-original-src="https://upload.acmicpc.net/3448947a-fa79-4dba-9f8f-4e564979447a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 338px; height: 300px;" /></p>

<p>칼의 칼날은 $2\times 2$ 크기의 정사각형 $N$개가 한 칸씩 맞물려 연결되어 있는 형태이다.</p>

<p>아래는&nbsp;$N = 6$일 때의 칼날을 나타낸 그림이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23256.%E2%80%85%EC%84%B1%EC%9D%B8%E2%80%85%EA%B2%8C%EC%9E%84/dabd4773.png" data-original-src="https://upload.acmicpc.net/a2870f41-fbc7-45b5-a548-a38a09be1e07/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 197px; width: 600px;" /></p>

<p>칼날은 $1\times 1$, $2\times 1$&nbsp;크기의 광석을 겹치지 않고 빈 칸이 없도록 적절히 붙여 만들 수 있다.</p>

<p>$N$이 주어질 때 만들 수 있는 서로 다른 칼날의 개수를 구하는 프로그램을 작성하시오.</p>

<p>광석은 어떤 경우에도 모자라지 않을 만큼 충분히 존재한다.</p>

<p>$2 \times 1$, $1&nbsp;\times 1$ 크기의 광석은 각각 다음과 같고 회전시킬 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23256.%E2%80%85%EC%84%B1%EC%9D%B8%E2%80%85%EA%B2%8C%EC%9E%84/482b20ae.png" data-original-src="https://upload.acmicpc.net/634e294f-d357-4ffc-a28b-df104c795a93/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 53px; width: 100px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23256.%E2%80%85%EC%84%B1%EC%9D%B8%E2%80%85%EA%B2%8C%EC%9E%84/164a4761.png" data-original-src="https://upload.acmicpc.net/2cf08c6b-0245-44c2-a797-26b780168336/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 53px; width: 53px;" /></p>

### 입력

<p>첫째 줄에 테스트 케이스의 수&nbsp;$T$가&nbsp;주어진다.</p>

<p>이후 $T$개의 줄에 걸쳐 $N$이 주어진다.</p>

### 출력

<p>각 테스트 케이스마다 만들 수 있는 서로 다른 칼날의 개수를 $1\,000\,000\,007$로 나눈 나머지를 출력하라.</p>

### 제한

<ul>
	<li>$1 \leq T&nbsp;\leq 1\,000$</li>
	<li>$1 \leq&nbsp; N \leq 1\,000\,000$&nbsp;</li>
</ul>