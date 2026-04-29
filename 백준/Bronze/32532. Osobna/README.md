# [Bronze I] Osobna - 32532

[문제 링크](https://www.acmicpc.net/problem/32532)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 74, 맞힌 사람: 62, 정답 비율: 81.579%

### 분류

구현, 문자열

### 문제 설명

<p>Toni, the new chairperson of COCI (in Croatian: <em>HONI</em>), loves HONI so much that he decided to change his last name to match the competition’s name. From now on, his name is Toni Honi! Excited about the change, Toni eagerly awaited his new personal ID card. When it finally arrived, he couldn’t stop staring at it. He was especially fascinated by the three lines of characters on the back of the card.</p>

<p>It didn’t take him long to realize that these lines contain some of his personal details: his first name, last name, birth date, and personal identification number (PIN). He copied the lines from his ID onto a piece of paper and identified the details he could recognize:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32532.%E2%80%85Osobna/f5313d3b.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32532-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 453px; height: 122px;"></p>

<p>In the first line, which consists of $5$ letters, $21$ digits, and $4$ '<code>&lt;</code>' characters, Toni discovered his PIN — the last $11$ digits of the line.</p>

<p>In the second line, he identified his birth date. The first two digits represent the year, the next two the month, and the final two digits the day of birth. If the two-digit year is less than or equal to <code>24</code>, it means the person was born in the $21$st century (so the full year starts with <code>20</code>). Otherwise, the person was born in the $20$th century (so the full year starts with <code>19</code>).</p>

<p>In the third line, Toni found his first name, followed by two '<code>&lt;</code>' characters, and then his last name. The rest of the line was padded with '<code>&lt;</code>' characters.</p>

<p>Toni found these discoveries fascinating and now wants you to join the fun — for the three lines on the back of the ID card, extract and print the person’s first name, last name, birth date, and personal identification number (PIN).</p>

### 입력

<p>The input consists of three lines of characters, each of length $30$. The characters that can appear are uppercase English letters, digits, and the character '<code>&lt;</code>'. The first name and last name will each consist of exactly one word and will be in uppercase English letters. Both names will fit entirely into the third line.</p>

### 출력

<p>Output four lines:</p>

<ul>
	<li>In the first line, print '<code>Ime: </code>' followed by the person’s first name, capitalized (only the first letter should be uppercase).</li>
	<li>In the second line, print '<code>Prezime: </code>' followed by the person’s last name, capitalized (only the first letter should be uppercase).</li>
	<li>In the third line, print '<code>Datum rodjenja: </code>' followed by the birth date in the format <code>DD-MM-YYYY</code>.</li>
	<li>In the fourth line, print '<code>OIB: </code>' followed by the person’s personal identification number (PIN).</li>
</ul>

<p>Side note: "Ime" stands for name, "Prezime" for surname, and "Datum rodjenja" for birth date when translated from Croatian.</p>