# [Platinum III] Data Center Maintenance - 30740

[문제 링크](https://www.acmicpc.net/problem/30740)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 6, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

그래프 이론, 그리디 알고리즘, 강한 연결 요소

### 문제 설명

<p>BigData Inc. is a corporation that has $n$ data centers indexed from $1$ to $n$ that are located all over the world. These data centers provide storage for client data (you can figure out that client data is really big!).</p>

<p>Main feature of services offered by BigData Inc. is the access availability guarantee even under the circumstances of any data center having an outage. Such a guarantee is ensured by using the <em>two-way replication</em>. Two-way replication is such an approach for data storage that any piece of data is represented by two identical copies that are stored in two different data centers.</p>

<p>For each of $m$ company clients, let us denote indices of two different data centers storing this client data as $c_{i,1}$ and $c_{i,2}$.</p>

<p>In order to keep data centers operational and safe, the software running on data center computers is being updated regularly. Release cycle of BigData Inc. is one day meaning that the new version of software is being deployed to the data center computers each day.</p>

<p>Data center software update is a non-trivial long process, that is why there is a special hour-long time frame that is dedicated for data center maintenance. During the maintenance period, data center computers are installing software updates, and thus they may be unavailable. Consider the day to be exactly $h$ hours long. For each data center there is an integer $u_j$ ($0 \leq u_j \leq h - 1$) defining the index of an hour of day, such that during this hour data center $j$ is unavailable due to maintenance.</p>

<p>Summing up everything above, the condition $u_{c_{i,1}} \neq u_{c_{i,2}}$ should hold for each client, or otherwise his data may be unaccessible while data centers that store it are under maintenance.</p>

<p>Due to occasional timezone change in different cities all over the world, the maintenance time in some of the data centers may change by one hour sometimes. Company should be prepared for such situation, that is why they decided to conduct an experiment, choosing some non-empty subset of data centers, and shifting the maintenance time for them by an hour later (i.e. if $u_j = h - 1$, then the new maintenance hour would become $0$, otherwise it would become $u_j + 1$). Nonetheless, such an experiment should not break the accessibility guarantees, meaning that data of any client should be still available during any hour of a day after the data center maintenance times are changed.</p>

<p>Such an experiment would provide useful insights, but changing update time is quite an expensive procedure, that is why the company asked you to find out the minimum number of data centers that have to be included in an experiment in order to keep the data accessibility guarantees.</p>

### 입력

<p>The first line of input contains three integers $n$, $m$ and $h$ ($2 \le n \le 100\,000$, $1 \le m \le 100\,000$, $2 \le h \le 100\,000$), the number of company data centers, number of clients and the day length of day measured in hours.</p>

<p>The second line of input contains $n$ integers $u_1, u_2, \ldots, u_n$ ($0 \le u_j &lt; h$), $j$-th of these numbers is an index of a maintenance hour for data center $j$.</p>

<p>Each of the next $m$ lines contains two integers $c_{i,1}$ and $c_{i,2}$ ($1 \le c_{i,1}, c_{i,2} \le n$, $c_{i,1} \neq c_{i,2}$), defining the data center indices containing the data of client $i$.</p>

<p>It is guaranteed that the given maintenance schedule allows each client to access at least one copy of his data at any moment of day.</p>

### 출력

<p>In the first line print the minimum possible number of data centers $k$ ($1 \leq k \leq n$) that have to be included in an experiment in order to keep the data available for any client.</p>

<p>In the second line print $k$ distinct integers $x_1, x_2, \ldots, x_k$ ($1 \leq x_i \leq n$), the indices of data centers whose maintenance time will be shifted by one hour later. Data center indices may be printed in any order.</p>

<p>If there are several possible answers, it is allowed to print any of them. It is guaranteed that at there is at least one valid choice of data centers.</p>

### 힌트

<p>Consider the first sample test. The given answer is the only way to conduct an experiment involving the only data center. In such a scenario the third data center has a maintenance during the hour 1, and no two data centers storing the information of the same client have maintenance at the same hour.</p>

<p>On the other hand, for example, if we shift the maintenance time on hour later for the first data center, then the data of clients 1 and 3 will be unavailable during the hour 0.</p>