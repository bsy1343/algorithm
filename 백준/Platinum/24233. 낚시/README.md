# [Platinum II] 낚시 - 24233

[문제 링크](https://www.acmicpc.net/problem/24233)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 226, 정답: 41, 맞힌 사람: 27, 정답 비율: 16.667%

### 분류

누적 합, 정렬, 스위핑

### 문제 설명

<p>동현이는 바다 위에서 표류 중이다. 그에게 남은 것은 오직 작살 하나뿐. 배가 고파진 동현이는 작살로 물고기를 잡아보려고 한다. 동현이는 다음&nbsp;그림과 같이 작살을&nbsp;수직 아래 방향으로 던진다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24233.%E2%80%85%EB%82%9A%EC%8B%9C/41c57b45.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24233.%E2%80%85%EB%82%9A%EC%8B%9C/41c57b45.png" data-original-src="https://upload.acmicpc.net/4c9a62cf-ed7f-4821-9106-c27e6b5c23af/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 325px;" /></p>

<p>바닷속에는 $N$마리의 물고기가 살고 있는데, 편의상 $i$번째 물고기의 현재 위치를 구간 [$S_i$, $E_i$]로 나타내자.</p>

<p>그런데 물고기는 살아있기 때문에 계속 움직인다. $i$번째 물고기의 속도는 $V_i$인데, 항상 수평 방향으로만 일정한 속도로 움직인다. 따라서 $t$초 후 $i$번째 물고기의 위치는 구간 [$S_i + tV_i$,&nbsp;$E_i + tV_i$]로 나타낼 수 있다.</p>

<p>동현이는 $t \ge 0$인 시점에서&nbsp;원하는 위치에 작살을 던질 수 있다.</p>

<p>만약 작살을 던진 위치가 물고기의 구간에 포함된다면 해당 물고기를 잡게 된다. 즉, $t$초 후에 작살을 위치 $x$에 던졌다고 하자. 만약&nbsp;$S_i + tV_i&nbsp;\le&nbsp;x \le&nbsp;E_i + tV_i$이면&nbsp;$i$번째 물고기를 잡은 것이다.</p>

<p>작살이 던져지는 속도는 매우 빠르기 때문에 무시할 수 있다. 오직 작살을 한 번만 던질 수 있을 때, 최대 몇 마리의 물고기를 잡을 수 있는지 구해보자.</p>

### 입력

<p>첫째 줄에는 물고기의 마릿수 $N$이 주어진다. ($1 \le&nbsp;N \le&nbsp;1,000$)</p>

<p>둘째 줄부터 $N$개의 줄에 걸쳐 3개의 정수 $S_i$, $E_i$, $V_i$가 주어진다. ($-1,000,000 \le S_i, E_i, V_i&nbsp;\le&nbsp;1,000,000$, $S_i&nbsp;&lt; E_i$)</p>

### 출력

<p>잡을 수 있는 최대 물고기 마릿수를 출력한다.</p>