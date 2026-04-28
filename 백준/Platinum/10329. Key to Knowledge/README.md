# [Platinum II] Key to Knowledge - 10329

[문제 링크](https://www.acmicpc.net/problem/10329)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 256 MB

### 통계

제출: 82, 정답: 45, 맞힌 사람: 38, 정답 비율: 56.716%

### 분류

양방향 탐색, 브루트포스 알고리즘, 자료 구조, 그래프 이론, 중간에서 만나기, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p><a href="https://xkcd.com/1289/"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10329.%E2%80%85Key%E2%80%85to%E2%80%85Knowledge/3d0c0ccb.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/upload/images2/simple_answers.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:556px; width:456px" /></a>A while ago a class of students took an exam. It consisted of true-or-false questions only, but the questions were really tough! Even afterward, with the help of the book, lecture notes and each other, the students are not sure what all the correct answers were. They could ask the professor of course, but he is not the kind of guy you would dare to disturb with questions that betray your ignorance. Anyway, the students at least have an idea of how they performed.</p>

<p>The professor has just returned the exams, but the results are not quite as expected. Unfortunately, he did not indicate on their exams which answers were right or wrong, he has simply put the number of correct answers at the top. So what were the correct answers according to the professor then? Given how far off some of the grades are from expected, there is a suspicion among some of the students that the professor did not count the correct answers properly.</p>

<p>Given, for each student, the answers he/she gave and the number of correct answers, can you work out what set of correct answers matches the results?</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with two space-separated integers n and m (1 &le; n &le; 12 and 1 &le; m &le; 30): the number of students and the number of questions in the exam, respectively.</li>
	<li>n lines, each with m digits, each digit either 0 or 1: the answers given by each student, with 0 representing &ldquo;false&rdquo; and 1 representing &ldquo;true&rdquo;. This is followed by a space and a single integer c (0 &le; c &le; m): the number of correct answers for that student.</li>
</ul>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with m digits, each one either 0 or 1: the unique set of correct answers that could account for all the results. If there is not exactly one such set, the line should read &ldquo;# solutions&rdquo; instead, with the number of solutions in place of &lsquo;#&rsquo;.</li>
</ul>