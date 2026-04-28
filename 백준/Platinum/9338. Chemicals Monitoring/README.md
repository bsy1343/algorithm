# [Platinum IV] Chemicals Monitoring - 9338

[문제 링크](https://www.acmicpc.net/problem/9338)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 7, 맞힌 사람: 6, 정답 비율: 27.273%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Victor works for Alberta Chemicals Monitoring (ACM). ACM is a company that analyses raw environmental data related to chemicals used in oil sand and other industries in Alberta, and produces some reports for environmental watchdogs.</p>

<p>Victor is in charge of a multi-processor cluster in ACM. Each processor is connected to a dedicated special purpose output generation unit (OGU). This cluster receives several raw data streams from ﬁeld sensors and assigns each stream to a processor. Each processor performs some real time processing on a data stream and immediately after its termination, produces a report using its OGU.</p>

<p>Each stream has an integer starting time s, an integer duration d and a priority p. This stream is active in the interval [s, s + d) (right-open interval). The report of each stream must be produced immediately after its termination; otherwise, it will be useless. An OGU creates a report extremely fast, so you can assume that an OGU produces this report instantly.</p>

<p>In the past, at any instance of time, the number of data streams were not more than the number of processors and OGUs. So, Victor could process all data streams. Unfortunately, recently, in a suspicious power surge, all OGUs burnt out. Victor was able to salvage one OGU by using parts from the other OGUs. Now, he can no longer produce a report for all data streams and needs to choose a subset of them based on the priorities assigned to them. To handle access to this OGU, Victor restructured the cluster architecture as follows. When a stream starts, the system either admits or rejects it. If it admits a stream, the unique identiﬁer of the processor assigned to this stream is pushed onto the stack. Only a processor having its identiﬁer on top of the stack can use the OGU to produce its report. After production of the report, the processor identiﬁer is popped from the stack. It should be noted that if some streams start at the same time, he can push their processor identiﬁer in any order of his choice. Now, Victor needs your help to choose a subset of streams such that their reports can be generated with this single OGU. The total priority of the streams in the chosen subset should be maximized.</p>

### 입력

<p>The input consists of a single test case. The ﬁrst line contains an integer n, where n (1 &le; n &le; 5000) is the number of data streams. Each of the next n lines contains three integers s<sub>i</sub>, d<sub>i</sub>, p<sub>i</sub> (1 &le; s<sub>i</sub>, d<sub>i</sub> &le; 10<sup>9</sup>, 0 &le; p<sub>i</sub> &le; 100, 000) describing one data stream, where s<sub>i</sub> is its start time, d<sub>i</sub> is the duration of the stream, and p<sub>i</sub> is its priority. Note that the cluster has at least 5000 processors.</p>

### 출력

<p>Display the maximum total priority of a subset of streams such that their reports can be generated with the architecture described above using a single OGU.</p>