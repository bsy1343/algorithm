# [Gold IV] 미적분학 입문하기 2 - 24726

[문제 링크](https://www.acmicpc.net/problem/24726)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 552, 정답: 307, 맞힌 사람: 253, 정답 비율: 64.051%

### 분류

수학, 기하학, 미적분학

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24726.%E2%80%85%EB%AF%B8%EC%A0%81%EB%B6%84%ED%95%99%E2%80%85%EC%9E%85%EB%AC%B8%ED%95%98%EA%B8%B0%E2%80%852/1ebf11fb.png" data-original-src="https://upload.acmicpc.net/c34591e3-29b9-4432-a2e8-42d66117cf59/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 274px; width: 500px;" /></p>

<p>연세대학교 1학년 이공계생들은 &quot;미분적분학과벡터해석&quot;, 또는 &quot;공학수학&quot;을 배우게 된다. 해당 과목에서 회전체의 부피에 대한 내용을 배운다. 닫힌&nbsp;구간 $[a,b]$에서의 함수 $r(x)$를 $x$축을 기준으로 회전시켰을 때 나오는 회전체의 부피는 $\displaystyle \pi \int_{a}^{b} \{r(x)\}^2 dx$로 구할 수 있다.</p>

<p>주어진 제 1사분면에 있는 삼각형을 $x$축과 $y$축을 기준으로 각각 회전시켰을 때 나오는 두 회전체의 부피를 위의 공식을 참고해서 구해보자.</p>

### 입력

<p>첫 번째 줄에 음이 아닌&nbsp;정수&nbsp;$x_1$, $y_1$,&nbsp;$x_2$, $y_2$,&nbsp;$x_3$, $y_3$가 주어진다. $(x_1, y_1)$,&nbsp;$(x_2, y_2)$,&nbsp;$(x_3, y_3)$은 삼각형의 각 꼭짓점&nbsp;좌표를&nbsp;의미한다. 세 점이 한 직선 위에 있지 않다. ($0&nbsp;\le x_1, y_1,&nbsp;x_2, y_2,&nbsp;x_3, y_3 \le 10 \, 000$)</p>

### 출력

<p>주어진 삼각형을 $x$축으로 회전시켰을 때 나오는&nbsp;회전체의 부피와 $y$축으로 회전시켰을 때 나오는 회전체의 부피를 공백을 사이에 두고 출력한다. 절대/상대 오차는 $10^{-6}$까지 허용한다.</p>