# [Platinum V] 막대 배치 - 8895

[문제 링크](https://www.acmicpc.net/problem/8895)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1873, 정답: 1094, 맞힌 사람: 867, 정답 비율: 59.876%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>높이가 1, 2, ..., n인 막대 n개가 일렬로 배치되어 있다. 막대를 왼쪽이나 오른쪽에서 보면, 큰 막대가 뒤에있는 작은 막대를 가리게 된다. 아래와 같이 4개의 막대로 이루어진 두 배치를 살펴보자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8895.%E2%80%85%EB%A7%89%EB%8C%80%E2%80%85%EB%B0%B0%EC%B9%98/81a96364.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8895.%E2%80%85%EB%A7%89%EB%8C%80%E2%80%85%EB%B0%B0%EC%B9%98/81a96364.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/upload/images/polearr.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:157px; width:412px" /></p>

<p>위의 두 배치는 모두 왼쪽에서 봤을 때 막대가 한 개 보이고, 오른쪽에서 봤을 때는 막대가 두 개 보인다.</p>

<p>막대의 개수 n과 왼쪽에서 봤을 때 보이는 막대의 개수 l, 오른쪽에서 봤을 때 보이는 막대의 개수 r이 주어진다. 이때, 이러한 결과를 만드는 배치의 개수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n, l, r이 주어진다. (1 &le; l, r &le; n &le; 20)</p>

### 출력

<p>각 테스트 케이스마다, 입력으로 주어진 값에 해당하는 배치의 수를 출력한다.</p>