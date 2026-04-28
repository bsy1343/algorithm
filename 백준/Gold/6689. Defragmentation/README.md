# [Gold III] Defragmentation - 6689

[문제 링크](https://www.acmicpc.net/problem/6689)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

함수형 그래프, 그래프 이론

### 문제 설명

<p>For the maximal security, the special secure operation system is used in the Summit Headquarters. This OS uses also the special file system. In this file system all disk space is divided into N clusters of equal sizes, numbered by integers from 1 to N. Each file occupies one or more clusters in arbitrary areas of the disk. All clusters that are not occupied by files are considered to be free. A file can be read from the disk in the fastest way, if all its clusters are situated in the successive disk clusters in the natural order.</p>

<p>Rotation of the disk with constant speed implies that various amounts of time are needed for accessing its clusters. Therefore, reading of clusters located near the beginning of the disk performs faster than reading of the ones located near its end. Thus, all files are numbered beforehand by integers from 1 to K in the order of descending frequency of access. Under the optimal placing of the files on the disk the file number 1 will occupy clusters 1, 2, ..., S<sub>1</sub>, the file number 2 will occupy clusters S<sub>1</sub> + 1, S<sub>1</sub> + 2, ..., S<sub>1</sub> + S<sub>2</sub> and so on (S<sub>i</sub> is the number of clusters occupied by the i-th file).</p>

<p>In order to place the files on the disk in the optimal way, cluster-moving operations are executed. One cluster-moving operation includes reading of one occupied cluster from the disk to the memory and writing its contents to some free cluster. After that, the first cluster is declared free, and the second one is declared occupied.</p>

<p>Your goal is to place the files on the disk in the optimal way by executing the minimal possible number of cluster-moving operations.</p>

### 입력

<p>The input consists of several disk descriptions. The first line of the description contains two integers N and K separated by a space, 1 &lt;= K &lt; N &lt;= 100000. Then K lines follow, each of them describes one file. The description of the i-th file starts with the integer S<sub>i</sub> that represents the number of clusters in the i-th file, 1 &lt;= S<sub>i</sub> &lt;= N-K. Then S<sub>i</sub> integers follow separated by spaces, which indicate the cluster numbers occupied by this file on the disk in the natural order. Each of these numbers is between 1 and N, inclusive.</p>

<p>All cluster numbers in one disk description are different and there is always at least one free cluster on the disk. The input is terminated with the line containing two zeros in place of numbers N and K.</p>

### 출력

<p>For each disk description, output exactly one line containing the sentence &quot;We need M move operations.&quot; where M is the minimal number of cluster-moving operations needed to place the files on the disk into the optimal clusters.</p>

<p>If the files on the disk are already placed in the optimal way, the output should only contain the sentence &quot;No optimization needed.&quot;.</p>