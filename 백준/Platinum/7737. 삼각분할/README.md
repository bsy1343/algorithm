# [Platinum I] 삼각분할 - 7737

[문제 링크](https://www.acmicpc.net/problem/7737)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 659, 정답: 168, 맞힌 사람: 106, 정답 비율: 34.304%

### 분류

수학, 자료 구조, 정수론, 세그먼트 트리, 조합론, 소수 판정, 분할 정복을 이용한 거듭제곱, 에라토스테네스의 체, 소인수분해

### 문제 설명

<p>삼각분할이란 볼록 다각형의 대각선을 이용해서 삼각형으로 분할하는 것이다. 두 대각선은 교차할 수 없다. 삼각분할을 이루는 대각선의 집합이 다르면 두 삼각분할은 서로 다른 삼각분할이다. (꼭짓점에 1번부터 N번까지 번호를 붙인다)</p>

<p>오각형을 삼각분할하는 방법은 총 다섯가지가 있으며, 아래 그림과 같다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7737.%E2%80%85%EC%82%BC%EA%B0%81%EB%B6%84%ED%95%A0/1c64430f.png" data-original-src="https://www.acmicpc.net/upload/images/tri.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:124px; width:841px" /></p>

<p>T<sub>n</sub>을 n각형을 삼각분할하는 방법의 수라고 했을 때, T<sub>3</sub> + T<sub>4</sub> + ... + T<sub>n</sub>을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 n과 m이 주어진다. (3 &le; n &le; 100,000, 2 &le; m &le; 10<sup>9</sup>)</p>

### 출력

<p>T<sub>3</sub> + ... + T<sub>n</sub>을 m으로 나눈 나머지를 출력한다.</p>