# [Platinum I] 아파트 임대 - 5615

[문제 링크](https://www.acmicpc.net/problem/5615)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 12638, 정답: 3114, 맞힌 사람: 1690, 정답 비율: 21.099%

### 분류

밀러–라빈 소수 판별법, 정수론, 수학, 소수 판정

### 문제 설명

<p>동규부동산에서 아파트를 임대하고 있다. 아파트의 방은 아래 그림과 같이 면적이 2xy + x + y이다. (x와 y는 양의 정수)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5615.%E2%80%85%EC%95%84%ED%8C%8C%ED%8A%B8%E2%80%85%EC%9E%84%EB%8C%80/aaff5de3.png" data-original-src="https://www.acmicpc.net/upload/images/apart.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 180px; height: 130px;" /></p>

<p>동규부동산의 카탈로그에는 아파트의 면적이 오름차순으로 적혀져 있지만, 이 중 일부는 있을 수 없는 크기의 아파트이다. 만약, 이런 크기의 아파트를 임대하겠다고 말하면, 동규는 꽝! 이라고 외치면서, 수수료만 떼어간다.</p>

<p>동규부동산의 카탈로그에 적힌 아파트의 면적이 주어졌을 때, 있을 수 없는 크기의 아파트의 수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 아파트의 면적의 수 N이 주어진다. 다음 줄부터 N개 줄에 카탈로그에 적혀있는 순서대로 면적이 주어진다. N은 100,000이하이고 면적은 2<sup>31</sup>-1이하인 양의 정수이다.</p>

### 출력

<p>첫째 줄에 있을 수 없는 아파트 면적의 수를 출력한다.</p>