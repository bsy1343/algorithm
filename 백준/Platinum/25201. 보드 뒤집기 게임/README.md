# [Platinum V] 보드 뒤집기 게임 - 25201

[문제 링크](https://www.acmicpc.net/problem/25201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 314, 정답: 210, 맞힌 사람: 176, 정답 비율: 69.565%

### 분류

수학, 애드 혹, 홀짝성, 불변량 찾기

### 문제 설명

<p style="text-align: center;"><img alt="곰곰이" src="%EB%B0%B1%EC%A4%80/Platinum/25201.%E2%80%85%EB%B3%B4%EB%93%9C%E2%80%85%EB%92%A4%EC%A7%91%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/c6a8220f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25201.%E2%80%85%EB%B3%B4%EB%93%9C%E2%80%85%EB%92%A4%EC%A7%91%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/c6a8220f.png" data-original-src="https://upload.acmicpc.net/2a25a7d6-27fd-4d7f-8e3f-410fbe3a8fd6/-/crop/199x229/70,100/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:100px; object-fit:contain; display:inline-block;" /></p>

<p>$10^5&nbsp;\times 10^5$ 크기의 커다란 격자판 위에서 곰곰이는 놀이 하나를 하고 있다. 이 격자판의 칸들 중 일부분은 빨간색으로 칠해져 있고, 나머지 칸은 노란색으로 칠해져 있다.</p>

<p>곰곰이는 이&nbsp;격자판 위에서 <strong>뒤집기 마법</strong>을 무제한으로 사용할 수 있다. 격자판의&nbsp;좌표 $(x, y)\ (1 \le x \lt 10^5, 1 \le y \lt 10^5, x,&nbsp;y$ 는 정수$)$ 를 하나 골라 <strong>뒤집기 마법</strong>을 사용하면, $(x, y), (x, y + 1), (x + 1, y), (x + 1, y + 1)$ 의 색이&nbsp;반전된다. 색이&nbsp;반전된다는 것은 빨간색 칸이&nbsp;노란색으로, 노란색 칸이&nbsp;빨간색으로 변경되는 것을 의미한다.<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25201.%E2%80%85%EB%B3%B4%EB%93%9C%E2%80%85%EB%92%A4%EC%A7%91%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/17392eca.jpg" data-original-src="https://boja.mercury.kr/assets/problem/25201-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="" /></p>

<p>현재 격자판의 상태를 <strong>뒤집기 마법</strong>만 이용하여 곰곰이가 원하는 격자판의 상태로 변경할 수 있는지 알아보자.</p>

### 입력

<p>첫 번째 줄에는 현재 격자판 상태에서의 빨간색으로 칠해진 칸의 좌표의 개수 $N$, 곰곰이가 원하는 격자판 상태에서의&nbsp;빨간색으로 칠해진 칸의 좌표의 개수 $M$ 이 공백을 사이에 두고 주어진다. ($1 \le N, M \le 10^5$)</p>

<p>두 번째 줄부터 $N$ 개의 줄에 걸쳐, 현재 격자판 상태에서의 빨간색으로 칠해진 칸의 $i$ 번째 좌표 $(x_i, y_i)$ 가 공백을 사이에 두고 주어진다. ($1 \le x_i, y_i \le 10^5,\ x_i, y_i$ 는 정수, $i&nbsp;\neq j $ 이면 $(x_i, y_i) \neq (x_j, y_j) $ 이다.)</p>

<p>$N+2$ 번째 줄부터 $M$ 개의 줄에 걸쳐, 곰곰이가 원하는 격자판 상태에서의 빨간색으로 칠해진 칸의 $i$ 번째 좌표 $(x_i, y_i)$ 가 공백을 사이에 두고 주어진다. ($1 \le x_i, y_i \le 10^5,\ x_i, y_i$ 는 정수, $i&nbsp;\neq j $ 이면 $(x_i, y_i) \neq (x_j, y_j) $ 이다.)</p>

### 출력

<p>현재 격자판의 상태를 <strong>뒤집기 마법</strong>만 이용하여 곰곰이가 원하는 격자판의 상태로 변경할 수 있다면 첫번째 줄에 <code>YES</code>를, 없다면 <code>NO</code>를 출력하라.</p>