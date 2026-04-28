# [Bronze I] Dance Dance Revolution - 22686

[문제 링크](https://www.acmicpc.net/problem/22686)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 125, 정답: 74, 맞힌 사람: 58, 정답 비율: 58.586%

### 분류

구현, 문자열

### 문제 설명

<p><i>Dance Dance Revolution</i>&nbsp;is one of the most popular arcade games in Japan. The rule of this game is very simple. A series of four arrow symbols,&nbsp;<i>up</i>,&nbsp;<i>down</i>,&nbsp;<i>left</i>&nbsp;and&nbsp;<i>right</i>, flows downwards on the screen in time to music. The machine has four panels under your foot, each of which corresponds to one of the four arrows, and you have to make steps on these panels according to the arrows displayed on the screen. The more accurate in timing, the higher score you will mark.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/22686.%E2%80%85Dance%E2%80%85Dance%E2%80%85Revolution/afc579cb.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/22686.%E2%80%85Dance%E2%80%85Dance%E2%80%85Revolution/afc579cb.png" data-original-src="https://upload.acmicpc.net/c0ec9e08-bf05-4e80-9f69-316e4e1865fd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 233px;" /></p>

<p style="text-align: center;">Figure 1: Layout of Arrow Panels and Screen</p>

<p>Each series of arrows is commonly called a score. Difficult scores usually have hundreds of arrows, and newbies will often be scared when seeing those arrows fill up the monitor screen. Conversely, scores with fewer arrows are considered to be easy ones.</p>

<p>One day, a friend of yours, who is an enthusiast of this game, asked you a favor. What he wanted is an automated method to see if given scores are&nbsp;<i>natural</i>. A score is considered as natural when there is a sequence of steps that meets all the following conditions:</p>

<ul>
	<li>left-foot steps and right-foot steps appear in turn;</li>
	<li>the same panel is not stepped on any two consecutive arrows;</li>
	<li>a player can keep his or her upper body facing forward during a play; and</li>
	<li>his or her legs never cross each other.</li>
</ul>

<p>Your task is to write a program that determines whether scores are natural ones.</p>

### 입력

<p>The first line of the input contains a positive integer. This indicates the number of data sets.</p>

<p>Each data set consists of a string written in a line. Each string is made of four letters, &ldquo;U&rdquo; for up, &ldquo;D&rdquo; for down, &ldquo;L&rdquo; for left and &ldquo;R&rdquo; for right, and specifies arrows in a score. No string contains more than 100,000 characters.</p>

### 출력

<p>For each data set, output in a line &ldquo;Yes&rdquo; if the score is natural, or &ldquo;No&rdquo; otherwise.</p>