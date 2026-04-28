# [Silver I] 2xN 예쁜 타일링 - 18230

[문제 링크](https://www.acmicpc.net/problem/18230)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2442, 정답: 653, 맞힌 사람: 556, 정답 비율: 28.095%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>2021년, 정보대 화장실에서 물이 자꾸 범람하는 탓에&nbsp;바닥 타일링을 다시 할 지경에 이르렀다. 타일링의 장인 민규는 &quot;언제나 타일링은&nbsp;예쁘게&quot;라는 좌우명으로 살아왔다. 새로 타일링을 해야 하는 화장실 바닥은 2&times;<em>N</em> 크기의 격자로 표현이 된다. 민규에게는 2&times;1 크기의 타일 <em>A</em>개와 2&times;2 크기의 타일 <em>B</em>개가 있다. 각 타일들에는 &quot;예쁨&quot;의 정도가 있는데, 화장실 바닥의 예쁨은 바닥을 구성하는 타일들의 예쁨의 합이 된다. 민규는 가지고 있는 타일들을 이용해서 화장실 바닥의&nbsp;예쁨이 최대로 되게 타일링&nbsp;하려고 한다. 이때, 얻을 수 있는 예쁨의 최댓값은 얼마일까?</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18230.%E2%80%852xN%E2%80%85%EC%98%88%EC%81%9C%E2%80%85%ED%83%80%EC%9D%BC%EB%A7%81/a3e8c9a3.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/18230.%E2%80%852xN%E2%80%85%EC%98%88%EC%81%9C%E2%80%85%ED%83%80%EC%9D%BC%EB%A7%81/a3e8c9a3.png" data-original-src="https://upload.acmicpc.net/eb53244b-f29a-4355-bce8-2104ad592baa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 158px; width: 200px;" /></p>

<p>예제 1의 예쁨의 최댓값으로 가능한 경우이다. 타일은 90도 회전이 가능하다.</p>

### 입력

<p>첫째 줄에 정수 <em>N</em>, <em>A</em>, <em>B</em>(1 &le; <em>N</em>, <em>A</em>, <em>B</em> &le; 2000, 2 &times;&nbsp;<em>B </em>+<em> A</em> &ge; <em>N</em>)가 공백으로 구분되어&nbsp;주어진다.</p>

<p>둘째 줄에 각 2&times;1 크기&nbsp;타일의 예쁨을 의미하는 정수 <em>A</em>개가 공백으로 구분되어 주어진다.</p>

<p>셋째 줄에 각 2&times;2 크기 타일의 예쁨을 의미하는 정수 <em>B</em>개가 공백으로 구분되어 주어진다.</p>

<p>각 타일의 예쁨은 1,000,000 이하의 양의 정수이다.</p>

### 출력

<p>민규가&nbsp;가지고 있는 타일들을 이용해서 얻을 수 있는 화장실 바닥의&nbsp;예쁨의 최댓값을 출력하시오.</p>