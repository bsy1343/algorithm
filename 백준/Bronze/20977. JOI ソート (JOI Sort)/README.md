# [Bronze II] JOI ソート (JOI Sort) - 20977

[문제 링크](https://www.acmicpc.net/problem/20977)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 437, 정답: 372, 맞힌 사람: 333, 정답 비율: 86.269%

### 분류

구현, 문자열, 정렬

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の文字列&nbsp;<var>S</var>&nbsp;が与えられる．<var>S</var>&nbsp;の各文字は &lsquo;<code>J</code>&rsquo;，&lsquo;<code>O</code>&rsquo;，&lsquo;<code>I</code>&rsquo; のいずれかである．</p>

<p>あなたは&nbsp;<var>S</var>&nbsp;の文字を並び替えて次の条件を満たすようにしたい．</p>

<ul>
	<li>すべての文字 &lsquo;<code>J</code>&rsquo; と文字 &lsquo;<code>O</code>&rsquo; の組について &lsquo;<code>J</code>&rsquo; が &lsquo;<code>O</code>&rsquo; よりも前にある．</li>
	<li>すべての文字 &lsquo;<code>O</code>&rsquo; と文字 &lsquo;<code>I</code>&rsquo; の組について &lsquo;<code>O</code>&rsquo; が &lsquo;<code>I</code>&rsquo; よりも前にある．</li>
	<li>すべての文字 &lsquo;<code>J</code>&rsquo; と文字 &lsquo;<code>I</code>&rsquo; の組について &lsquo;<code>J</code>&rsquo; が &lsquo;<code>I</code>&rsquo; よりも前にある．</li>
</ul>

<p>文字列&nbsp;<var>S</var>&nbsp;が与えられたとき，上の条件を満たすように&nbsp;<var>S</var>&nbsp;の文字を並び替えた文字列を出力するプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<p><var>N</var><br />
<var>S</var></p>

### 출력

<p>条件を満たすように&nbsp;<var>S</var>&nbsp;の文字を並び替えた文字列を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>S</var>&nbsp;は長さ&nbsp;<var>N</var>&nbsp;の文字列である．</li>
	<li><var>S</var>&nbsp;の各文字は &lsquo;<code>J</code>&rsquo;，&lsquo;<code>O</code>&rsquo;，&lsquo;<code>I</code>&rsquo; のいずれかである．</li>
</ul>