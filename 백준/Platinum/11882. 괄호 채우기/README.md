# [Platinum I] 괄호 채우기 - 11882

[문제 링크](https://www.acmicpc.net/problem/11882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 300, 정답: 72, 맞힌 사람: 60, 정답 비율: 35.294%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>괄호열이란 2개의 기호 &#39;<code>(</code>&#39;와 &#39;<code>)</code>&#39;를 이용해서 만들 수 있는 모든 문자열을 말합니다. 괄호열에 &quot;<code>+</code>&quot;과 &quot;<code>1</code>&quot;을 적당히 끼워넣으면 올바른 수식이 만들어질 때, 우리는 이를 올바른 괄호열이라고 합니다. 예로 들어, &quot;<code>(()(()))</code>&quot;, &quot;<code>()(()(())())</code>&quot;은 올바른 괄호열이고, &quot;<code>)(</code>&quot;, &quot;<code>(()))()</code>&quot;은 올바른 괄호열이 아닙니다.</p>

<p>저는 여러분에게 괄호열을 활용한 아주 쉬운 문제를 내고, 입력 데이터를 만들었습니다. 각 입력 데이터에는 올바른 괄호열이 들어가 있습니다. 그런데 이 채점 데이터를 열어보니, 괄호열의 일부가 아래와 같이 <code>?</code>로 바뀌어 있었습니다! 불행 중 다행으로, 각 &#39;<code>?</code>&#39;는 무조건 1개의 <code>(</code> 또는 <code>)</code> 기호가 깨진 것임을 알 수 있었습니다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11882.%E2%80%85%EA%B4%84%ED%98%B8%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/fc02efa8.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11882/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:123px; width:433px" /></p>

<p>저는 모든 입력 데이터를 복구하고자 합니다. 그러나 단순하게 복구하면 데이터가 제가 의도했던 것보다 훨씬 쉬워질 것 같으니, 저는 왼쪽에서 i번째에 위치한 &#39;<code>?</code>&#39;마다 &#39;<code>(</code>&#39;로 바꾸는데 드는 비용 l<sub>i</sub>와 &#39;<code>)</code>&#39;로 바꾸는데 드는 비용 r<sub>i</sub>를 계산해 놓았습니다.</p>

<p>여러분은 비용이 가장 적게 들도록 각 물음표를 <code>(</code> 또는 <code>)</code>로 적당히 치환하여 올바른 괄호열을 만들어 내는 프로그램을 작성해야 합니다. 괄호열을 복구하는 데 드는 총 비용은 각 물음표를 &#39;<code>(</code>&#39;나 &#39;<code>)</code>&#39;로 바꾸는 데 드는 비용의 합입니다. 이러한 경우가 여러 개 있으면 아무거나 만들면 됩니다. 제가 좋은 데이터를 만들 수 있도록 도와주세요! ㅠㅠ</p>

### 입력

<p>첫 번째 줄에 손상된 괄호열의 길이 N (N은 짝수, 2 &le; N &le; 100,000)이 주어지고, 두 번째 줄에 &#39;<code>(</code>&#39;, &#39;<code>)</code>&#39;, &#39;<code>?</code>&#39;로만 구성된 손상된 괄호열이 주어집니다. 손상된 괄호열에서 <code>?</code>의 빈도수를 Q (1 &le; Q &le; N)라고 할 때, Q개 줄에 두 자연수 l<sub>i</sub>와 r<sub>i</sub> (1 &le; l<sub>i</sub>, r<sub>i</sub> &le; 10<sup>5</sup>)가 공백을 사이로 두고 주어집니다. (1 &le; i &le; Q)</p>

### 출력

<p>첫 번째 줄에 최소 비용을 출력하고, 두 번째 줄에 복구한 괄호열을 출력합니다. 최소 비용으로 만들 수 있는 괄호열이 여러 개 있으면 아무거나 출력하면 됩니다.</p>