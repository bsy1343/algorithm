# [Platinum V] Too Many Edges - 33394

[문제 링크](https://www.acmicpc.net/problem/33394)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 2048 MB

### 통계

제출: 36, 정답: 10, 맞힌 사람: 8, 정답 비율: 25.806%

### 분류

그래프 이론, 다이나믹 프로그래밍, 방향 비순환 그래프, 역추적, 위상 정렬

### 문제 설명

<p><em>This is an interactive problem. You have to use the <code>flush</code> operation right after printing each line. For example, you can use the function <code>fflush(stdout)</code> for C or C++, <code>System.out.flush()</code> for Java, <code>flush(output)</code> for Pascal, and <code>sys.stdout.flush()</code> for Python.</em></p>

<p>You are an ordinary employee of a data analysis department. However, it seems that your colleagues are geniuses at making trouble. Just now they made some trouble again.</p>

<p>They downloaded a large graph from the remote server and wrote a program to analyze the graph. They nearly finished the analysis and thought the graph should be no longer useful. So they let their program add some new edges to the graph without any backups. But then they changed their mind and want to compute the longest path in the original graph. Downloading the graph again costs too much time. Now it is your time to save the day.</p>

<p>The original graph on the remote server is a directed acyclic graph $G=(V,E)$. All edges are unit length. The input of your program is the modified version $G'=(V,E')$. It is guaranteed that $E\subseteq E'$, <strong>and $G'$ is a directed acyclic graph</strong>.</p>

<p>Your program should output $\ell(G)$, the length of the longest path in $G$. The length of a path equals the number of edges in the path.</p>

<p>To test whether an edge belongs to the original graph, your program can make queries to the remote server. To query the existence of edge $u \to v$, output "<code>?</code> $u$ $v$". Flush the output stream after printing each query. The remote server will respond <code>1</code> if edge $u \to v$ belongs to the original graph, and <code>0</code> otherwise.</p>

<p>After your program gets the answer, print "<code>!</code> $\mathit{ans}$", where $ans = \ell(G)$, and <strong>terminate your program normally</strong> immediately after flushing the output stream.</p>

<p>Your program is allowed to make no more than $\left(|E'| - |E| + 1\right) \cdot \left(\ell(G) + 1\right)$ queries (not including printing the answer) to the remote server, although $|E|$ and $\ell(G)$ are unknown to you.</p>

### 입력

<p>Use standard input to read the responses to the queries.</p>

<p>The first line contains two integers $n$ and $m$ ($1 \le n \le 5 \cdot 10^4$; $1 \le m \le 10^5$): the number of vertices and edges of graph $G'$.</p>

<p>Each of the next $m$ lines contains two integers $u$ and $v$ ($1 \le u, v \le n$) specifying a directed edge $u \to v$ in graph $G'$. No edge appears more than once.</p>

<p>It is guaranteed that $0 \le |E'| - |E| \le 200$.</p>

<p>The following lines will contain responses to your queries. Each response is either "<code>0</code>" or "<code>1</code>". The $i$-th of these lines is a response to your $i$-th query.</p>

<p>After answering $\left(|E'| - |E| + 1\right) \cdot \left(\ell(G) + 1\right)$ queries, the remote server no longer responds.</p>

<p>The testing system will allow you to read the response to a query only after your program prints the query and performs the <code>flush</code> operation.</p>

### 출력

<p>To make the queries, your program must use standard output.</p>

<p>Your program must print the queries in the form of "<code>?</code> $u$ $v$", one query per line. Do not forget to end the line after each query. Your program must guarantee that $1 \le u, v \le n$. After printing each line your program must perform the <code>flush</code> operation.</p>

<p>The response to the query will be given in the standard input after you flush the output. In case your program finds the answer, print a line "<code>!</code> $\mathit{ans}$", where $\mathit{ans} = \ell(G)$, and terminate your program.</p>