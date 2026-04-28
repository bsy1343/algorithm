# [Platinum III] 성냥팔이 소년 - 17448

[문제 링크](https://www.acmicpc.net/problem/17448)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 833, 정답: 78, 맞힌 사람: 72, 정답 비율: 12.142%

### 분류

많은 조건 분기, 그리디 알고리즘

### 문제 설명

<p>동현이는 성냥팔이 소년이다. 하지만, 요즘 같은 세상에 성냥을 사는 사람이 어디 있겠는가. 안 팔리는 성냥만 집에 잔뜩 쌓인 동현이는 성냥개비를 가지고 뭐라도 하고 놀려고 한다.</p>

<p>동현이는 지금 정수 <span style="font-style: italic;">N</span>개와 성냥개비 <span style="font-style: italic;">K</span>개를 가지고 있다. 우선, 동현이는 <span style="font-style: italic;">T</span>라는 정수를 하나 만들고 그 값을 1로 정했다. 이후, 동현이는 <span style="font-style: italic;">N</span>개의 정수 각각에 대해서 다음 세 가지 행동 중 하나를 할 것이다.</p>

<ul>
	<li>성냥개비를 사용하지 않고 그냥 넘어간다.</li>
	<li>성냥개비를 1개 사용하고, -<span style="font-style: italic;">X</span>를 <span style="font-style: italic;">T</span>에 곱한다. (단, <span style="font-style: italic;">X</span>는 그 정수의 원래 값)</li>
	<li>성냥개비를 2개 사용하고, +<span style="font-style: italic;">X</span>를 <span style="font-style: italic;">T</span>에 곱한다. (단, <span style="font-style: italic;">X</span>는 그 정수의 원래 값)</li>
</ul>

<p style="margin-top: 15px;"><img alt="alt text" src="%EB%B0%B1%EC%A4%80/Platinum/17448.%E2%80%85%EC%84%B1%EB%83%A5%ED%8C%94%EC%9D%B4%E2%80%85%EC%86%8C%EB%85%84/c9ca5f21.png" data-original-src="https://upload.acmicpc.net/206c154a-606f-4cd9-9bf5-5c75349061fa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 500px;" /></p>

<p style="margin-bottom: 15px; text-align: center;">각 정수에 대해 할 수 있는 3가지 행동.</p>

<p>동현이는 성냥개비를 원하는 만큼 사용하여 <span style="font-style: italic;">T</span>의 값을 최대화하고 싶다. (성냥개비를 사용하지 않아도 된다.) 하지만 동현이는 몇 번 해보다가 싫증이 나서 던져버리고 게임이나 하러 가 버렸다. 여러분은 똑똑하니까 동현이 대신 이 문제를 풀어 주자!</p>

### 입력

<p>첫 줄에 동현이가 가진 정수의 개수 <span style="font-style: italic;">N</span>과 성냥개비의 개수 <span style="font-style: italic;">K</span>가 주어진다. (1 &le; <span style="font-style: italic;">N</span> &le; 300,000, 1 &le; <span style="font-style: italic;">K</span> &le; 2&times;<span style="font-style: italic;">N</span>)</p>

<p>두 번째 줄에 동현이가 가진 <span style="font-style: italic;">N</span>개의 정수들이 주어진다. 각 수들의 절댓값은 10<sup>9</sup> 이하이다.</p>

### 출력

<p>동현이가 성냥개비를 적절히 사용하여 <span style="font-style: italic;">T</span>의 값을 최대화했을 때, 그 값을 10<sup>9</sup>+7로 나눈 나머지를 출력한다.</p>

### 힌트

<p>동현이가 3, -5, 6에 각각 성냥개비 1개씩을 썼을 때 <span style="font-style: italic;">T</span>의 값이 (-3) &times; 5 &times; (-6) = 90으로 최대이다.</p>