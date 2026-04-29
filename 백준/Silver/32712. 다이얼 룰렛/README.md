# [Silver II] 다이얼 룰렛 - 32712

[문제 링크](https://www.acmicpc.net/problem/32712)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 438, 정답: 165, 맞힌 사람: 152, 정답 비율: 43.804%

### 분류

그리디 알고리즘, 누적 합, 브루트포스 알고리즘

### 문제 설명

<p>길이가 $N$인 수열 $A$의 원소들을 원형의 다이얼에 기준점의 오른쪽부터 차례대로 나열한 형태를 다이얼 룰렛이라고 하자. 건덕이는 다이얼을 회전해 점수를 얻을 수 있다. 다이얼을 시계 방향 또는 반시계 방향으로 한 칸 돌리는 것을 <strong>회전</strong>이라고 하며, 이때 기준점을 지나치는 수를 점수에 더한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32712.%E2%80%85%EB%8B%A4%EC%9D%B4%EC%96%BC%E2%80%85%EB%A3%B0%EB%A0%9B/36b9a447.png" data-original-src="https://boja.mercury.kr/assets/problem/32712-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 316px; width: 300px;"></p>

<p>건덕이가 다이얼 룰렛을 $K$번 회전해 점수를 최대로 얻을 수 있도록 도와주자.</p>

### 입력

<p>첫째 줄에 수열 $A$의 길이 $N$과 회전 횟수 $K$가 공백으로 구분되어 주어진다. $(1\leq N\leq 200,000;$ $1\leq K\leq 10^9)$</p>

<p>둘째 줄에 수열 $A$의 원소 $A_i$가 공백으로 구분되어 주어진다. $\left(1\leq A_i\leq 10^9\right)$</p>

### 출력

<p>건덕이가 다이얼 룰렛을 $K$번 회전해 얻을 수 있는 점수의 최댓값을 출력한다.</p>

### 힌트

<p>초기 상태에서 시계 방향으로 $1$번 회전하면 $A_N$만큼의 점수를 얻는다.</p>