# [Silver IV] Backup - 23419

[문제 링크](https://www.acmicpc.net/problem/23419)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 47, 정답: 35, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

구현

### 문제 설명

<p>There are many different backup strategies. The easiest to understand are the differential and incremental backups.</p>

<p>With incremental backup, we create a copy of the data which were changed from the moment of the last backup: for instance, after a full backup on Sunday, on Monday we copy the data that were changed during Monday; the same goes for Tuesday, etc. With such strategy, the volume of data copied is relatively small, but it may require a lot of files to restore the data. For instance, to restore data on Friday, we would need backup copies from Sunday (full backup), Monday, Tuesday, Wednesday and Thursday.</p>

<p>With differential backup, we regularly create a full copy --- for instance, every Sunday. Next, on each day of the week we make a copy of all data modified after the last full backup: a Monday copy on Monday, a Monday and Tuesday copy on Tuesday, etc. The total volume of the backed up data is relatively large, but you only need two files to restore data: the last differential and the last full backup.</p>

<p>Dump(1), a popular backup freeware, operates with the concept of backup level, which can perform incremental or differential backup as well as more complex strategies, which cannot be reduced to the two former methods. The idea of backup levels as such is pretty simple: when we make an $N$ level backup, we copy all files modified from the moment of the last backup with the level lower than $N$. &nbsp;If there are no preceding lower-level backups, we make a complete backup copy of all data.</p>

<p>Write a program to figure out which backup files should be used for recovery based on the backup schedule.</p>

### 입력

<p>The first line of the input file contains the number $M$ -- the total number of tests in the file ($0 &lt; M \le 100\,000$).</p>

<p>Each following line of the input file consists of eight space-separated integers. The first seven numbers are schedule of backups, i.e. the levels of backup $N_i$, which are performed on the corresponding days of the week $i$: on Sunday, Monday, Tuesday, etc. ($0 \le N_i \le 9$). It is guaranteed that the zero-level backup is performed on Sunday, i.e. the first number is zero.</p>

<p>The eighth number is the day $d$ when data must be recovered ($0 \le d \le 6$). Note that $0$ is Sunday and $6$ is Saturday.</p>

### 출력

<p>For each line of the output file, print a sequence of numbers $d_j$ corresponding to the days when the backup copies necessary for recovery were made ($0 \le d_j \le 6$). Note that the earliest copy is always recovered first, followed by a later copy, hence the following must hold true: $d_j &lt; d_{j+1}$ and $N_{d_j} &lt; N_{d_{j+1}}$. Moreover, the recovery always ends with the latest copy, so the last number in the line must equal $d$.</p>