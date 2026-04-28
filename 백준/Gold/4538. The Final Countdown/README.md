# [Gold V] The Final Countdown - 4538

[문제 링크](https://www.acmicpc.net/problem/4538)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 26, 맞힌 사람: 24, 정답 비율: 35.294%

### 분류

구현, 문자열

### 문제 설명

<p>When Doctor Doom modeled LAI-BACH (the Latverian Aerospace Institute, Bolograd Active Control Headquarters) on Mission Command with NASA, he perhaps cribbed from the source a bit too closely.</p>

<p>NASA (and therefore LAI-BACH) have a peculiar way of handling countdowns to missions. While the clock may state that it is, say, thirty minutes until liftoff for a rocket or shuttle, there are built-in holds where the clock is stopped for a set amount of time. For example, there may be a 15-minute hold when the countdown reaches the 8-minute mark. The end result is that more time passes from the beginning of the countdown to the end than the numbers on the clock would imply.</p>

<p>LAI-BACH uses a simple &quot;command file&quot; format to manage holds for their countdowns on their computer systems. All commands start with a positive integer no greater than 1440 (countdowns longer than a day make Doctor Doom angry), followed by a directive. The format of the commands is as follows:</p>

<table class="table table-bordered" style="width:60%">
	<tbody>
		<tr>
			<td><code>t START</code></td>
			<td>t is the start time on the countdown clock, in minutes.</td>
		</tr>
		<tr>
			<td><code>t HOLD n</code></td>
			<td>A mandatory hold for n minutes at countdown clock time t.</td>
		</tr>
		<tr>
			<td><code>t HOLD n IF condition</code></td>
			<td>A hold at countdown clock time t for n minutes if condition is true.</td>
		</tr>
		<tr>
			<td><code>t HOLD n IF NOT condition</code></td>
			<td>A hold at countdown clock time t for n minutes if condition is not true.</td>
		</tr>
	</tbody>
</table>

<p>All conditions are represented by short strings of lowercase letters, no more than 20 characters long; their actual values are not provided in the command structure, as they are determined by actual conditions during the launch (whether the fuel tanks have been topped off, whether the Fantastic Four is currently fighting Doctor Doom, and so on), but they are always either true or false and do not change during the course of a single countdown. A hold time n is a positive integer no more than 60 (minutes), as long delays also irritate Victor.</p>

<p>Given a particular command file, you are to determine both the shortest possible time and the longest possible time that the countdown can run. The commands may be present in any order, but there will always be one and only one START directive; there will be precisely as much whitespace on each line as dictated by the format given above. No two commands in a command file will reference the same minute t.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer N (1 &le; N &le; 100) indicating the number of data sets. Each data set consists of the following components:</p>

<ul>
	<li>A line containing a single integer L (1 &le; L &le; 100) indicating the number of lines in the particular &quot;command file&quot;; and</li>
	<li>A series of L lines representing the command file, in the format described above.</li>
</ul>

### 출력

<p>For each data set, print &quot;min TO max&quot;, where min is the shortest possible time the countdown can last in minutes, and max is the longest possible time the countdown can last in minutes.</p>