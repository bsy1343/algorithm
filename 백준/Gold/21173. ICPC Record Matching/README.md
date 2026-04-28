# [Gold V] ICPC Record Matching - 21173

[문제 링크](https://www.acmicpc.net/problem/21173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 23, 맞힌 사람: 21, 정답 비율: 42.857%

### 분류

구현, 문자열, 정렬, 파싱

### 문제 설명

<p>When using &quot;software-as-a-service&quot; offerings, a user often has a problem of matching records stored by the different services and determining if they refer to the same entity (person, account, order, etc.) &nbsp;The ICPC is no exception. &nbsp;While each participant has a record in the central ICPC registration system, additional &quot;outside&quot; applications may be used to collect and process information for functionality not provided by the central system.</p>

<p>Once an &quot;outside&quot; application is used, it becomes necessary to match the entries from both systems. &nbsp;Unfortunately, in spite of careful directions, sometimes it is not clear if records correspond to the same person. &nbsp;The primary sorts of mis-matches that occur are these:</p>

<ol>
	<li>&nbsp;E-mail addresses do not match. &nbsp;This could be due to a misspelling, such as <em>.eud</em> instead of <em>.edu,</em> or different e-mail addresses that a participant used in the central ICPC system and the outside system.</li>
	<li>&nbsp;Exact names do not match. &nbsp;This could be due to a typing error, or varying use of legal names and nicknames.</li>
</ol>

<p>Your team is to write a program that will read lists of people from the ICPC system and an outside system and determine which records in each system do not match a record in the other system. &nbsp;Two entries are considered matched if <em>either</em> the e-mail addresses are an exact match <em>or</em> the last name and first name are an exact match.</p>

### 입력

<p>Input to your program is two lists of name and e-mail address records. &nbsp;Each record consists of a first name, a last name, and an e-mail address, one per line, separated from each other by tabs. &nbsp;The first list is the records from the central ICPC registration system. This list ends with an empty line. &nbsp;The second list is the records from the outside application. &nbsp;The second list ends with the end-of-file. (These lists are suitable test data, not actual ICPC data.)</p>

<p>E-mail addresses do not exceed $64$ characters in length. E-mail addresses consist of lower-case and upper-case English letters, digits, and the special characters at-sign, underscore, hyphen, and period. &nbsp;E-mail addresses do not begin with special characters.</p>

<p>First and last names do not exceed $24$ characters in length. &nbsp;Names consist of lower-case and upper-case English letters and hyphens. Names do not begin with hyphens.</p>

<p>Each input list will contain at least $1$ but not more than $2\,000$ entries. &nbsp;E-mail addresses and (first name, last name) pairings will be unique within each list.</p>

### 출력

<p>Your program is to print lines showing the records from each list that could not be matched to the other list. Your program is to first print the central ICPC registration records that could not be matched, one per line. &nbsp;Each line should consist of the letter &quot;<code>I</code>&quot;, a single space, the e-mail address, a single space, the last name, a single space, and the first name. &nbsp;These are to be printed in lexicographical e-mail address order. &nbsp;The e-mail addresses, last names, and first names are to be printed exactly the way they appear in the input. &nbsp;Once all such records are printed, the outside application records that could not be matched are to be printed the same way, except that each line should begin with the letter &quot;<code>O</code>&quot;.</p>

<p>Case is to be ignored for all record matching comparisons and sorting.</p>

<p>Should all records from each system have a match in the other system, your program is to print a line containing only the string &quot;<code>No mismatches.</code>&quot;.</p>