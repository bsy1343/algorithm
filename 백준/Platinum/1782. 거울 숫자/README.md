# [Platinum V] 거울 숫자 - 1782

[문제 링크](https://www.acmicpc.net/problem/1782)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 695, 정답: 76, 맞힌 사람: 58, 정답 비율: 20.939%

### 분류

수학, 구현, 브루트포스 알고리즘, 백트래킹, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>디지털 화면에서 숫자(디지털 숫자)는 코레스코 콘도에 돌아다니는 엘리베이터에 나온 숫자처럼 쓴다.</p>

<p>어떤 디지털 숫자를 거울에 비춰봤을 때 그 숫자가 원래 숫자와 같으면 그 숫자를 거울 숫자라고 부른다. 0과 1과 8은 서로 대칭이고, 2와 5는 서로 거울에 비췄을 때 반대 숫자를 보여준다. 다른 숫자는 대칭으로 보여지지 않는다. 거울 숫자로 이루어진 수를 거울 수라고 한다.</p>

<p>예를 들어, 0, 101, 1521은 거울 수이다. 하지만, 1221이나 1010은 거울 수가 아니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/a80b0086.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/a80b0086.png" data-original-src="https://upload.acmicpc.net/26321504-5ba4-4a9e-9dc4-e04f8dc72a78/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/7fdffa3e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/7fdffa3e.png" data-original-src="https://upload.acmicpc.net/001706ea-995d-4de4-8f97-98319b86f252/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/0b7a3264.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/0b7a3264.png" data-original-src="https://upload.acmicpc.net/ec119bfa-8a56-4201-b1ed-1cf2d5549bf2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/a4cca0cf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1782.%E2%80%85%EA%B1%B0%EC%9A%B8%E2%80%85%EC%88%AB%EC%9E%90/a4cca0cf.png" data-original-src="https://upload.acmicpc.net/f84092b9-9eb0-49f8-9e3f-8e4630cafa77/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>두 수 A와 B가 들어오면, A와 B 사이에 있는 거울 수의 개수를 출력하는 프로그램을 작성하시오. A와 B도 포함한다.</p>

### 입력

<p>첫째 줄에 두 정수 A와 B가 공백을 사이에 두고 주어진다.</p>

### 출력

<p>첫째 줄에 거울 숫자의 개수를 출력한다.</p>

### 제한

<ul>
	<li>0 &le; A &le; B &le; 10<sup>18</sup></li>
</ul>