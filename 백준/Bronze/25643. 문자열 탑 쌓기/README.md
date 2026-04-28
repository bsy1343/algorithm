# [Bronze I] 문자열 탑 쌓기 - 25643

[문제 링크](https://www.acmicpc.net/problem/25643)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1333, 정답: 511, 맞힌 사람: 452, 정답 비율: 40.979%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25643.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%E2%80%85%ED%83%91%E2%80%85%EC%8C%93%EA%B8%B0/4ec8cad1.png" data-original-src="https://upload.acmicpc.net/1c9437d8-61d6-4151-83ed-c5d7088a4195/-/crop/4000x1545/0,455/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 232px; width: 600px;" /></p>

<p>인경이는 $N$개의 문자열을 쌓아서 문자열 탑을 완성하려고 한다. 탑을 완성하기 위해서는 모든 문자열을 한 층에 하나씩 아래에서부터 순서대로 쌓아 올려야 한다.</p>

<p>인경이는 문자열 탑의 꼭대기에 다음 순서의 문자열을 쌓을 수 있다. 단, 탑을 튼튼하게 만들기 위해서 탑의 꼭대기에 위치한 문자열과 새로 쌓으려는 문자열이 <strong>둘이 겹치는 부분이 완전히 동일</strong>하게 쌓아야 한다. 가장 첫 문자열인 경우는 바닥에 아무렇게나 쌓을 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25643.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%E2%80%85%ED%83%91%E2%80%85%EC%8C%93%EA%B8%B0/da770b3e.png" data-original-src="https://upload.acmicpc.net/d9094d8d-b9d1-4e61-9ef3-ad05aba6d9ca/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25643.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%E2%80%85%ED%83%91%E2%80%85%EC%8C%93%EA%B8%B0/d2793395.png" data-original-src="https://upload.acmicpc.net/0c0cd21c-3a51-4b06-9d19-34da9456572b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25643.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%E2%80%85%ED%83%91%E2%80%85%EC%8C%93%EA%B8%B0/82e18d5e.png" data-original-src="https://upload.acmicpc.net/cbb48a1d-2665-48f2-bcb8-2f7f3055c105/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25643.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%E2%80%85%ED%83%91%E2%80%85%EC%8C%93%EA%B8%B0/bf335950.png" data-original-src="https://upload.acmicpc.net/fd6d3fba-c892-4afa-8b54-864b30e72a79/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25643.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%E2%80%85%ED%83%91%E2%80%85%EC%8C%93%EA%B8%B0/b160ec39.png" data-original-src="https://upload.acmicpc.net/f2cbaeb9-2712-46bf-a847-d111f7e5531f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 154px;" /></p>

<p>예를 들어, <code>abc</code> 위에 <code>cab</code> 를 쌓는다고 할 때, 일부가 겹치게 쌓는 경우의 수는 위와 같이 $5$개가 있다. 그 중에서 <code>abc</code>와 <code>cab</code>가 겹치는 부분이 완전히 동일한 경우만 쌓을 수 있다.</p>

<p>인경이가 문자열을 잘 쌓는다면 $N$개의 문자열을 순서대로 쌓아서 문자열 탑을 완성하는 것이 가능할까?</p>

### 입력

<p>첫째 줄에 주어지는 문자열의 개수 $N(1\le N \le 100)$과 문자열의 길이 $M(1\le M \le 100)$이 주어진다.</p>

<p>둘째 줄부터 $N$개의 줄에 $s_1, s_2, ... ,s_N$이 주어진다. $s_i$는 $i$번째로 쌓는 문자열을 의미한다. 주어지는 모든 문자열은 길이가 $M$이며 알파벳 소문자로만 이루어져 있다.</p>

### 출력

<p>모든 문자열을 순서대로 쌓아서 탑을 완성할 수 있다면 <code>1</code> 을 그렇지 않다면 <code>0</code> 을 출력한다.</p>