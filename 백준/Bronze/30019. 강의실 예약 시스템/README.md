# [Bronze II] 강의실 예약 시스템 - 30019

[문제 링크](https://www.acmicpc.net/problem/30019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1503, 정답: 832, 맞힌 사람: 701, 정답 비율: 56.305%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>충남대학교 공대 5호관에는 $1$번부터 $N$번까지 번호가 매겨진 $N$개의 강의실이 있다. 학생들은 강의실 예약 시스템을 통해 원하는 강의실을 예약한 후에 이용할 수 있다. 강의실을 예약하기 위해서는 이용하려는 강의실의 번호 $k$와 이용 시작 시각과 끝 시각 $s,e$를 예약 시스템에 전송해야 한다.</p>

<p>어느 날, 예약 시스템에 $M$개의 예약 요청이 주어졌다. 예약 요청은 이용 시작 시각 $s$가 임박한 순으로 주어지고, 이용 시작 시각이 같은 예약은 없다. 예약 시스템은 예약 요청을 순서대로 확인하는데, 어떤 예약이 기존에 같은 강의실에 대해 수락한 예약과 겹치지 않는다면 그 예약을 수락하고 그렇지 않다면 거부한다. 단, 이용 끝 시각과 이용 시작 시각이 같은 두 예약은 겹친 것이 아니다.</p>

<p>$M$개의 예약 요청이 주어질 때, 강의실 예약 시스템이 각 예약 요청을 수락하는지 거부하는지 구해보자.</p>

### 입력

<p>첫째 줄에 정수 $N,M(1\le N,M\le 200\, 000)$이 주어진다.</p>

<p>둘째 줄부터 $M$개의 줄에 $i$번째 예약의 강의실 번호 $k_i(1\le k_i\le N)$와 이용 시작 시각과 끝 시각을 의미하는 정수 $s_i,e_i(1\le s_i&lt;e_i\le 10^9)$가 주어진다. $M$개의 예약은 이용 시작 시각 $s$를 기준으로 오름차순으로 주어지며, 이용 시작 시각이 같은 예약은 주어지지 않는다.</p>

### 출력

<p>$M$개의 줄에 순서대로 각 예약 요청을 수락한다면 <span style="color:#e74c3c;"><code>YES</code></span>를, 거부한다면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

### 힌트

<p>입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다.</p>

<p>C++을 사용하고 있고 <code>cin/cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다 적용해 주고, <code>endl</code> 대신 개행 문자(<code>\n</code>)를 쓰자. 단, 이렇게 하면 더 이상 <code>scanf/printf/puts/getchar/putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.</p>

<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다. <code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

<p>Python을 사용하고 있다면, <code>input</code> 대신 <code>sys.stdin.readline</code>을 사용할 수 있다. 단, 이때는 맨 끝의 개행 문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</p>