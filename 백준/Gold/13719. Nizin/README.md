# [Gold III] Nizin - 13719

[문제 링크](https://www.acmicpc.net/problem/13719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 105, 정답: 75, 맞힌 사람: 69, 정답 비율: 73.404%

### 분류

그리디 알고리즘, 두 포인터

### 문제 설명

<p>Do Geese See God? Or, Was It A Rat I Saw? Nevermind the geese or rats, this is just an&nbsp;unnecessary introduction to showcase Mislav&rsquo;s love of palindromes. Help him solve the&nbsp;following task!</p>

<p>Let A be an array of N integers. We say that A is palindromic if for each i it holds A[i] =&nbsp;A[N-i+1], where A[i] ​represents the ith&nbsp;element of array A, and the index of the first element in&nbsp;the array is 1.</p>

<p>Mislav can modify the array in the following way: in a single move, he chooses two adjacent&nbsp;elements of that array and replaces them with their sum. Notice that the number of elements&nbsp;in the array is going to decrease by 1 after each move. Mislav wants to know what is the&nbsp;least number of moves he must make in order for the original array to become palindromic.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10<sup>6</sup>) that represents the number of&nbsp;elements in the array.<br />
The following line contains N space-separated positive integers that represent the elements&nbsp;in Mislav&rsquo;s array. The numbers in the input will be at most 10<sup>9</sup>.&nbsp;</p>

### 출력

<p>Output the minimal number of moves it takes to transform the original array to a palindromic&nbsp;one, given the rules from the task.&nbsp;</p>

### 힌트

<p><strong>1 2</strong> ​3 -&gt; 3 3&nbsp;</p>