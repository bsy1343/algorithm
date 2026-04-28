# [Platinum II] Jogging - 10898

[문제 링크](https://www.acmicpc.net/problem/10898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 16 MB

### 통계

제출: 182, 정답: 27, 맞힌 사람: 20, 정답 비율: 20.000%

### 분류

볼록 껍질, 자료 구조, 기하학, 스택

### 문제 설명

<p>2차원 세계에 살고 있는 대영이는 x축 위의 점으로 볼 수 있다. 대영이는 매일 저녁 조깅을 하는데, x좌표가 증가하는 방향으로만 달린다. 2차원 세계에는 저녁만 되어도 별이 총총히 뜬다. 대영이는 조깅을 하다가 힘들어지면 잠시 쉬고 위에 있는 별들을 바라본다. 별들은 2차원 위의 점으로 표현할 수 있고, 대영이는 현재 자신의 x좌표보다 x좌표가 더 큰 별들만 바라본다. 대영이는 이때 가장 높이 있는 별이 무엇인지 알고 싶다. 높이 있다는 말은 대영이가 그 별을 보기 위해 고개를 들어야 하는 정도, 즉 각도가 가장 높은 별이라는 의미이다. 대영이를 도와주자!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10898.%E2%80%85Jogging/5bf8eef9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10898/pic1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:149px; width:317px" /></p>

### 입력

<p>첫 번째 줄에 별의 개수 N(1 &le; N &le; 10<sup>5</sup>)과 대영이가 쉬는 횟수 M(1 &le; M &le; 10<sup>5</sup>)이 공백으로 구분되어 주어진다.</p>

<p>다음 N개의 줄에는 별의 좌표를 나타내는 두 개의 정수 x,y(|x| &le; 10<sup>8</sup>, 1 &le; y &le; 10<sup>8</sup>)가 공백으로 구분되어 주어진다.</p>

<p>다음 M개의 줄에는 대영이가 휴식을 취하는 x좌표가 각 줄마다 하나씩 주어진다. 이 좌표들은 증가하는 순서대로 주어지며, 절댓값이 10<sup>8</sup> 이하이다.</p>

### 출력

<p>대영이가 쉴 때마다 가장 높은 곳에 있는 별의 각도를 rad단위로 소수점 아래 일곱 번째 자리까지 출력하라. 만약 별이 보이지 않는 경우 0.0000000을 출력하라.</p>