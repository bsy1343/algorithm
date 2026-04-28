# [Silver II] 병사 배치하기 - 18353

[문제 링크](https://www.acmicpc.net/problem/18353)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 15726, 정답: 6583, 맞힌 사람: 4991, 정답 비율: 42.600%

### 분류

다이나믹 프로그래밍, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p><em>N</em>명의 병사가 무작위로 나열되어 있다. 각 병사는 특정한 값의 전투력을 보유하고 있으며, 병사를 배치할 때는 전투력이 높은 병사가 앞쪽에 오도록 내림차순으로 배치를 하고자 한다. 다시 말해&nbsp;앞쪽에 있는 병사의 전투력이 항상 뒤쪽에 있는 병사보다 높아야 한다.</p>

<p>또한 배치 과정에서는 특정한 위치에 있는 병사를 열외시키는 방법을 이용한다. 그러면서도 남아있는 병사의 수가 최대가 되도록 하고 싶다.</p>

<p>예를 들어, <em>N</em>=7일 때 나열된 병사들의 전투력이 다음과 같다고 가정하자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18353.%E2%80%85%EB%B3%91%EC%82%AC%E2%80%85%EB%B0%B0%EC%B9%98%ED%95%98%EA%B8%B0/975a3ed9.png" data-original-src="https://upload.acmicpc.net/d8a7b6e4-7524-42b0-841b-419dc0386ba4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 730px; height: 86px;" /></p>

<p style="text-align: justify;">이 때 3번 병사와 6번 병사를 열외시키면, 다음과 같이 남아있는 병사의 수가 내림차순의 형태가 되며 5명이 된다. 이는 남아있는 병사의 수가 최대가 되도록 하는 방법이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18353.%E2%80%85%EB%B3%91%EC%82%AC%E2%80%85%EB%B0%B0%EC%B9%98%ED%95%98%EA%B8%B0/1fb24b46.png" data-original-src="https://upload.acmicpc.net/675a238f-f754-458f-92a6-c98c2d801d1a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 87px; width: 560px;" /></p>

<p style="text-align: justify;">병사에 대한 정보가 주어졌을 때, 남아있는 병사의 수가 최대가 되도록 하기 위해서 열외해야 하는 병사의 수를 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 <em>N</em>이 주어진다. (1 &le;&nbsp;<em>N&nbsp;</em>&le; 2,000) 둘째 줄에 각 병사의 전투력이 공백을 기준으로 구분되어 차례대로 주어진다. 각 병사의 전투력은 10,000,000보다 작거나 같은 자연수이다.</p>

### 출력

<p>첫째 줄에 남아있는 병사의 수가 최대가 되도록 하기 위해서 열외해야 하는 병사의 수를 출력한다.</p>