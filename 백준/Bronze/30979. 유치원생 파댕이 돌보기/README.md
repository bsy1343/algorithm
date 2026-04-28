# [Bronze IV] 유치원생 파댕이 돌보기 - 30979

[문제 링크](https://www.acmicpc.net/problem/30979)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2879, 정답: 2280, 맞힌 사람: 2165, 정답 비율: 80.067%

### 분류

수학, 사칙연산

### 문제 설명

<p>유치원생 파댕이는 아직 어리기 때문에 단것을 매우 좋아한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/30979.%E2%80%85%EC%9C%A0%EC%B9%98%EC%9B%90%EC%83%9D%E2%80%85%ED%8C%8C%EB%8C%95%EC%9D%B4%E2%80%85%EB%8F%8C%EB%B3%B4%EA%B8%B0/885b2b54.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/30979.%E2%80%85%EC%9C%A0%EC%B9%98%EC%9B%90%EC%83%9D%E2%80%85%ED%8C%8C%EB%8C%95%EC%9D%B4%E2%80%85%EB%8F%8C%EB%B3%B4%EA%B8%B0/885b2b54.png" data-original-src="https://upload.acmicpc.net/3e15c0ec-3db2-4bf7-ad17-d8f419520591/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 221px; width: 256px;" /></p>

<p>또한, 파댕이는 사탕을 주지 않으면 시도 때도 없이 울곤 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/30979.%E2%80%85%EC%9C%A0%EC%B9%98%EC%9B%90%EC%83%9D%E2%80%85%ED%8C%8C%EB%8C%95%EC%9D%B4%E2%80%85%EB%8F%8C%EB%B3%B4%EA%B8%B0/535c7680.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/30979.%E2%80%85%EC%9C%A0%EC%B9%98%EC%9B%90%EC%83%9D%E2%80%85%ED%8C%8C%EB%8C%95%EC%9D%B4%E2%80%85%EB%8F%8C%EB%B3%B4%EA%B8%B0/535c7680.png" data-original-src="https://upload.acmicpc.net/10984a1d-ee07-4d12-be63-dfc2bf93557a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 221px; width: 256px;" /></p>

<p>파댕이를 사랑하는 여러분은 일정 시간 동안 파댕이를 돌봐주기로 했다. 여러분은 파댕이를 돌보는 동안 파댕이가 우는 것을 보고 싶지 않기에, 파댕이가 울지 않도록 사탕을 챙겨왔다. 하지만 파댕이를 빨리 보고 싶은 마음에 급하게 사탕을 챙기느라, 돌보는 동안 파댕이가 울지 않게 만들 수 있는 충분한 사탕의 개수인지 확인하지 못했다. 여러분이 가지고 있는 사탕으로 파댕이를 돌보는 동안 파댕이를 울지 않게 만들 수 있는지 알아보자!</p>

<p>여러분은 $T$분 동안 파댕이를 돌봐야 하며, $N$개의 사탕을 가지고 있다. 파댕이는 사탕의 맛에 따라 울음을 그치는 시간이 다르며, 사탕의 맛이 $F$일 때 $F$분 동안 울음을 멈춘다.</p>

### 입력

<p>첫 번째 줄에 파댕이를 돌봐야 하는 시간을 나타내는 정수 $T$ $(1 \leq T \leq 1 \, 000)$가 주어진다. 두 번째 줄에 가지고 있는 사탕의 총 개수를 나타내는 정수 $N$ $(1 \leq N \leq 100)$이 주어진다. 세 번째 줄에 각 사탕의 맛을 나타내는 정수 $F$ $(1 \leq F \leq 10)$가 공백으로 구분되어 총 $N$개가 주어진다.</p>

### 출력

<p>파댕이를 $T$ 분 동안 울지 않게 만들 수 있다면 <span style="color:#e74c3c;"><code>Padaeng_i Happy</code></span>를 출력한다. 이외의 경우에는 <span style="color:#e74c3c;"><code>Padaeng_i Cry</code></span>를 출력한다.</p>