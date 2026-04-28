# [Platinum IV] Directory Traversal - 15746

[문제 링크](https://www.acmicpc.net/problem/15746)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 260, 정답: 124, 맞힌 사람: 107, 정답 비율: 50.952%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Bessie the cow is surprisingly computer savvy. On her computer in the barn, she stores all of her precious files in a collection of directories; for example:</p>

<pre>
bessie/
  folder1/
    file1
    folder2/
      file2
  folder3/
    file3
  file4
</pre>

<p>There is a single &quot;top level&quot; directory, called bessie.</p>

<p>Bessie can navigate to be inside any directory she wants. From a given directory, any file can be referenced by a &quot;relative path&quot;. In a relative path, the symbol &quot;..&quot; refers to the parent directory. If Bessie were in folder2, she could refer to the four files as follows:</p>

<pre>
../file1
file2
../../folder3/file3
../../file4
</pre>

<p>Bessie would like to choose a directory from which the sum of the lengths of the relative paths to all the files is minimized.</p>

### 입력

<p>The first line contains an integer N ($2 \leq N \leq 100,000$), giving the total number of files and directories. For the purposes of input, each object (file or directory) is assigned a unique integer ID between 1 and $N$, where ID 1 refers to the top level directory.</p>

<p>Next, there will be $N$ lines. Each line starts with the name of a file or directory. The name will have only lower case characters a-z and digits 0-9, and will be at most 16 characters long. Following the name is an integer, $m$. If $m$ is 0, then this entity is a file. If $m &gt; 0$, then this entity is a directory, and it has a total of $m$ files or directories inside it. Following $m$ there will be $m$ integers giving the IDs of the entities in this directory.</p>

### 출력

<p>Output the minimal possible total length of all relative paths to files. Note that this value may be too large to fit into a 32-bit integer.</p>

### 힌트

<p>This input describes the example directory structure given above.</p>

<p>The best solution is to be in folder1. From this directory, the relative paths are:</p>

<pre>
file1
folder2/file2
../folder3/file3
../file4
</pre>