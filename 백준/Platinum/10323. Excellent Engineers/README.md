# [Platinum II] Excellent Engineers - 10323

[문제 링크](https://www.acmicpc.net/problem/10323)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 64, 정답: 31, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

자료 구조, 정렬, 세그먼트 트리

### 문제 설명

<p>You are working for an agency that selects the best software engineers from Belgium, the Netherlands and Luxembourg for employment at various international companies. Given the very large number of excellent software engineers these countries have to offer, the agency has charged you to develop a tool that quickly selects the best candidates available from the agency&rsquo;s files.</p>

<p>Before a software engineer is included in the agency&rsquo;s files, he has to undergo extensive testing. Based on these tests, all software engineers are ranked on three essential skills: communication skills, programming skills, and algorithmic knowledge. The software engineer with rank one in the category algorithmic knowledge is the best algorithmic expert in the files, with rank two the second best, etcetera.</p>

<p>For potential customers, your tool needs to process the agency&rsquo;s files and produce a shortlist of the potentially most interesting candidates. A software engineer is a potential candidate that is to be put on this shortlist if there is no other software engineer in the files that scores better on all three skills. That is, an engineer is to be put on the shortlist if there is no other software engineer that has better communication skills, better programming skills, and more algorithmic knowledge.</p>

<p style="text-align:center"><a href="https://xkcd.com/125/"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10323.%E2%80%85Excellent%E2%80%85Engineers/77d110d3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10323.%E2%80%85Excellent%E2%80%85Engineers/77d110d3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/upload/images2/marketing_interview.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:297px; width:600px" /></a></p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with a single integer n (1 &le; n &le; 100 000): the number of software engineers in the agency&rsquo;s files.</li>
	<li>n lines, each with three space-separated integers r<sub>1</sub>, r<sub>2</sub> and r<sub>3</sub> (1 &le; r<sub>1</sub>, r<sub>2</sub>, r<sub>3</sub> &le; n): the rank of each software engineer from the files with respect to his communication skills, programming skills and algorithmic knowledge, respectively.</li>
</ul>

<p>For each skill s and each rank x between 1 and n, there is exactly one engineer with r<sub>s</sub> = x.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with a single integer: the number of candidates on the shortlist.</li>
</ul>