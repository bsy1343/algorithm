# [Platinum IV] Speleology - 8059

[문제 링크](https://www.acmicpc.net/problem/8059)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 34, 맞힌 사람: 27, 정답 비율: 37.500%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>A team of speleologists organizes a training in the Great Cave of Byte Mountains. During the training each speleologist explores a route from Top Chamber to Bottom Chamber. The speleologists may move down only, i.e. the level of every consecutive chamber on a route should be lower then the previous one. Moreover, each speleologist has to start from Top Chamber through a different corridor and each of them must enter Bottom Chamber using different corridor. The remaining corridors may be traversed by more then one speleologist. How many speleologists can train simultaneously?</p>

<p>Write a program which:</p>

<ul>
	<li>reads the cave description from the standard input,</li>
	<li>computes the maximal number of speleologists that may train simultaneously,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer n (2 &le; n &le; 200), equal to the number of chambers in the cave. The chambers are numbered with integers from 1 to n in descending level order - the chamber of greater number is at the higher level than the chamber of the lower one. (Top Chamber has number 1, and Bottom Chamber has number n). In the following n-1 lines (i.e. lines 2,3,&hellip;,n) the descriptions of corridors are given. The (i+1)-th line contains numbers of chambers connected by corridors with the -th chamber. (only chambers with numbers grater then i are mentioned). The first number in a line, m, 0 &le; m &le; (n-i+1), is a number of corridors exiting the chamber being described. Then the following &nbsp;integers are the numbers of the chambers the corridors are leading to.</p>

### 출력

<p>Your program should write one integer in the only line of the standard output. This number should be equal to the maximal number of speleologists able to train simultaneously.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8059.%E2%80%85Speleology/aec65bd5.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8059/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:426px; width:249px" /></p>