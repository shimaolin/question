<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Question</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">知识点</div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    curitis
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">问题分类</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">分类列表</a></dd>
                        <dd><a href="javascript:;">添加分类</a></dd>
                        <dd><a href="javascript:;">编辑分类</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">问题</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">问题列表</a></dd>
                        <dd><a href="javascript:;">添加问题</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">经验</a></li>
                <li class="layui-nav-item"><a href="">文章</a></li>
            </ul>
        </div>
    </div>