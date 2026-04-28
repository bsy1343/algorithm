# [Silver IV] 데이터 스트림의 섬 - 10432

[문제 링크](https://www.acmicpc.net/problem/10432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 463, 정답: 315, 맞힌 사람: 278, 정답 비율: 71.100%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>n개의 정수 수열 a1, a2, a3, ..., an에 대해, 섬이란 다음 조건을 만족하는 연속된 부분수열을 말한다.</p>

<ul>
	<li>섬의 모든 수는 부분수열이 시작하기 직전 수보다 크다.</li>
	<li>섬의 모든 수는 부분수열이 끝난 직후의 수보다 크다.</li>
</ul>

<p>아래의 예시에는 각각의 예제 수열에 대한 모든 섬이 표시되어 있다.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Silver/10432.%E2%80%85%EB%8D%B0%EC%9D%B4%ED%84%B0%E2%80%85%EC%8A%A4%ED%8A%B8%EB%A6%BC%EC%9D%98%E2%80%85%EC%84%AC/bdbd57ad.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10432.%E2%80%85%EB%8D%B0%EC%9D%B4%ED%84%B0%E2%80%85%EC%8A%A4%ED%8A%B8%EB%A6%BC%EC%9D%98%E2%80%85%EC%84%AC/bdbd57ad.png" data-original-src="https://www.acmicpc.net/upload/images2/island(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>이 문제에서 수열은 항상 12개의 음이 아닌 정수로 이루어져 있다.</p>

<p>이때, 총 섬의 개수를 출력하라.</p>

### 입력

<p>첫 줄에 테스트 케이스의 수 P가 주어진다. (1 &le; P &le; 1000)</p>

<p>각 테스트 케이스는 테스트 케이스의 번호 T와 12개의 음이 아닌 정수로 이루어져 있다. 또한, 12개의 정수 중 첫 수와 마지막 수는 항상 0이다.</p>

### 출력

<p>각 테스트 케이스마다 테스트 케이스의 번호와 섬의 수를 공백으로 구분하여 출력한다.</p>